package com.ecommerce.productCatalog.service;

import com.ecommerce.productCatalog.entity.Product;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    @Query("")
    public List<Product> getProductByID(int productID);

    public String createProduct(String productName, String categoryName);
}
