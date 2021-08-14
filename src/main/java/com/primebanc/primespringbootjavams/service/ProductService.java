package com.primebanc.primespringbootjavams.service;

import com.primebanc.primespringbootjavams.entities.ProductInformation;
import com.primebanc.primespringbootjavams.enums.ProductType;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public CommonResponse buyProduct(ProductInformation product){
        ProductInformation productFromStore = productRepo.findProductInformationByUserNameAndProductID(product.getUserName(), product.getProductID());
        if(null == productFromStore) {
            productRepo.save(product);
            return new CommonResponse("ADDED","Product added to your portfolio");
        } else if(productFromStore.getProductType() == ProductType.FP){
            return new CommonResponse("EXISTS","Product available in your portfolio");
        } else {
            product.setQuantity(productFromStore.getQuantity()+ product.getQuantity());
            productRepo.save(product);
            return new CommonResponse("ADDED","Product added to your portfolio");
        }
    }

    public CommonResponse sellProduct(ProductInformation product){
        ProductInformation productFromStore = productRepo.findProductInformationByUserNameAndProductID(product.getUserName(), product.getProductID());
        if(null == productFromStore || product.getQuantity() > productFromStore.getQuantity()){
            return new CommonResponse("INVALID","Product not in Portfolio or insufficient quantity");
        } else if (productFromStore.getQuantity() == product.getQuantity()){
            productRepo.delete(productFromStore);
            return new CommonResponse("UPDATED","Product sale initiation successful.");
        } else {
            productFromStore.setQuantity(productFromStore.getQuantity() - product.getQuantity());
            productRepo.save(productFromStore);
            return new CommonResponse("UPDATED","Product sale initiation successful.");
        }
    }

    public List<ProductInformation> fetchProductOwnedByUser(String userName){
        return productRepo.findProductInformationByUserName(userName);
    }
}
