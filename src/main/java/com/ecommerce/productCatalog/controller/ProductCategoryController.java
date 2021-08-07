package com.ecommerce.productCatalog.controller;


import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCategoryController {

    @GetMapping("/product")
    public String getProductByID(@RequestParam String productId){

            return "";

    }
}
