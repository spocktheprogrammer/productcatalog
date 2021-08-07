package com.ecommerce.productCatalog.service.serviceimpl;

import com.ecommerce.productCatalog.entity.Attributes;

import java.util.List;

public interface AttributesService {

    public List<Attributes> getAttributesByID(int attributeId);
}
