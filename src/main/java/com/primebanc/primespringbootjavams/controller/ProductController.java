package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.entities.ProductInformation;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
