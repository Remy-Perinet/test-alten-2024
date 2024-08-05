package com.alten.shop.product_service;

import com.alten.shop.product_service.enums.Category;
import com.alten.shop.product_service.enums.InventoryStatus;

public class ProductMapper {
    
    public static ProductDto toDto(Product db){
        ProductDto dto = new ProductDto();
        dto.setId(db.getId())
            .setCode(db.getCode())
            .setName(db.getName())
            .setDescription(db.getDescription())
            .setQuantity(db.getQuantity())
            .setImage(db.getImage())
            .setRating(db.getRating())
            .setPrice(db.getPrice());
        if(db.getCategory() != null){
            dto.setCategory(db.getCategory().getLabel());
        }
        if(db.getInventoryStatus() != null){
            dto.setInventoryStatus(db.getInventoryStatus().getLabel());
        }
        return dto;
    }

    public static Product toDb(ProductDto dto){
        Product db = new Product();
        db.setId(dto.getId())
            .setCode(dto.getCode())
            .setName(dto.getName())
            .setCategory(Category.valueOfLabel(dto.getCategory()))
            .setInventoryStatus(InventoryStatus.valueOfLabel(dto.getInventoryStatus()))
            .setDescription(dto.getDescription())
            .setQuantity(dto.getQuantity())
            .setImage(dto.getImage())
            .setRating(dto.getRating())
            .setPrice(dto.getPrice());
        return db;
    }
}
