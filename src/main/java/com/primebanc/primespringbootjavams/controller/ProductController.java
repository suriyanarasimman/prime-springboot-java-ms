package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.entities.ProductInformation;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.model.FinancialProduct;
import com.primebanc.primespringbootjavams.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/buy", method = RequestMethod.POST)
    public CommonResponse buyProduct(@RequestBody ProductInformation product){
        return productService.buyProduct(product);
    }

    @RequestMapping(value = "/sell", method = RequestMethod.POST)
    public CommonResponse sellProduct(@RequestBody ProductInformation product){
        return productService.sellProduct(product);
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public List<ProductInformation> fetchUserOwnedProducts(@PathVariable String userName){
        return productService.fetchProductOwnedByUser(userName);
    }

    @RequestMapping(value = "/catalog", method = RequestMethod.GET)
    public List<FinancialProduct> fetchFinancialProductList(){
        return productList();
    }

    private List<FinancialProduct> productList() {
        List<FinancialProduct> financialProductsList = new ArrayList<>();
        financialProductsList.add(new FinancialProduct("Short term gold","WM001","FP","WEALTH",3000,4000,"Pay 3000 over 12 months,  after which you will get 4000. You can choose to pay monthly or quarterly"));
        financialProductsList.add(new FinancialProduct("Long term platinum","WM002","FP","WEALTH",4000,6000,"Pay 4000 over 24 months and get 6000 at the end of 24th month, this is a tax saving plan."));
        financialProductsList.add(new FinancialProduct("Income Plus","I001","FP","INCOME",7000,10000,"Income gain after 2 years, payout ($ 10000) is done in installments over 6 months"));
        financialProductsList.add(new FinancialProduct("Income Excel","I002","FP","INCOME",6000,10000,"Income gain after 5 years, payout ($ 10000) is done in installments over 6 months, This is a non taxable income."));
        return financialProductsList;
    }
}
