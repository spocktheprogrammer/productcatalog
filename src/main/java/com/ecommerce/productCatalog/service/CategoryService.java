package com.ecommerce.productCatalog.service;

import com.ecommerce.productCatalog.entity.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getCategoryId(int categoryId);

    public String createCategory(String categoryName);
}
