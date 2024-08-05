package com.alten.shop.product_service.converters;

import com.alten.shop.product_service.enums.InventoryStatus;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class InventoryStatusConverter implements AttributeConverter<InventoryStatus, String> {
    @Override
    public String convertToDatabaseColumn(InventoryStatus is) {
        if (is == null) {
            return null;
        }
        return is.getCode();
    }

    @Override
    public InventoryStatus convertToEntityAttribute(String code) {
        return InventoryStatus.valueOfcode(code);
    }
}
