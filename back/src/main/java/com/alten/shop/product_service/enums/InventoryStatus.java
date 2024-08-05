package com.alten.shop.product_service.enums;

public enum InventoryStatus {
    LOWSTOCK("LO", "LOWSTOCK"),
    INSTOCK("IN", "INSTOCK"),
    OUTOFSTOCK("OU", "OUTOFSTOCK");


    private final String code;
    private final String label;

    InventoryStatus(String code, String label){
        this.code = code;
        this.label = label;
    }

    public static InventoryStatus valueOfcode(String code) {
        for (InventoryStatus e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }

    public static InventoryStatus valueOfLabel(String label) {
        for (InventoryStatus e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }

    public String getCode(){
        return this.code;
    }

    public String getLabel(){
        return this.label;
    }
}
