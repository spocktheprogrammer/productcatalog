package com.ecommerce.productCatalog.entity;


import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Product_generator")
    @SequenceGenerator(name = "Product_generator", sequenceName = "Product_sequence", allocationSize = 1)
    @Column(name = "product_id", nullable = false)
    private Long productID;

    @Column(name="product_Name")
    private String productName;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}
