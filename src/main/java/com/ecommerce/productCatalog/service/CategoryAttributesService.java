package com.ecommerce.productCatalog.service;

import com.ecommerce.productCatalog.entity.Attributes;
import com.ecommerce.productCatalog.entity.CategoryAttributes;

import java.util.List;

public interface CategoryAttributesService {

    public List<CategoryAttributes> getCategoryAttributes(int categoryId);

    public boolean createCategoryAttributes(int categoryId, List<Attributes> attributes);
}
