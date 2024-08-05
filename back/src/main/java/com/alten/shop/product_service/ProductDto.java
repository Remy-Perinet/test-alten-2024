package com.alten.shop.product_service;

public class ProductDto {
    private Long id;

    private String code;
    
    private String name;
    
    private String description;
    
    private Float price;
    
    private Integer quantity;

    private String inventoryStatus;

    private String category;

    private String image;

    private Integer rating;

    public Long getId() {
        return this.id;
    }

    public ProductDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public ProductDto setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ProductDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public ProductDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public Float getPrice() {
        return this.price;
    }

    public ProductDto setPrice(Float price) {
        this.price = price;
        return this;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public ProductDto setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getInventoryStatus() {
        return this.inventoryStatus;
    }

    public ProductDto setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public ProductDto setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getImage() {
        return this.image;
    }

    public ProductDto setImage(String image) {
        this.image = image;
        return this;
    }

    public Integer getRating() {
        return this.rating;
    }

    public ProductDto setRating(Integer rating) {
        this.rating = rating;
        return this;
    }
}
