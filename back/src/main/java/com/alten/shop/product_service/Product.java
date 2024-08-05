package com.alten.shop.product_service;

import com.alten.shop.product_service.enums.Category;
import com.alten.shop.product_service.enums.InventoryStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String code;
    
    private String name;
    
    private String description;
    
    private Float price;
    
    private Integer quantity;

    private InventoryStatus inventoryStatus;

    private Category category;

    private String image;

    private Integer rating;


    public Long getId() {
        return this.id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public Product setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public Float getPrice() {
        return this.price;
    }

    public Product setPrice(Float price) {
        this.price = price;
        return this;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Product setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public InventoryStatus getInventoryStatus() {
        return this.inventoryStatus;
    }

    public Product setInventoryStatus(InventoryStatus inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
        return this;
    }

    public Category getCategory() {
        return this.category;
    }

    public Product setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public Product setImage(String image) {
        this.image = image;
        return this;
    }

    public Integer getRating() {
        return this.rating;
    }

    public Product setRating(Integer rating) {
        this.rating = rating;
        return this;
    }
}
