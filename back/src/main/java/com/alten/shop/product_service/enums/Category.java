package com.alten.shop.product_service.enums;

public enum Category {
    ACCESSORIES("AC", "Accessories"),
    FITNESS("FI", "Fitness"),
    CLOTHING("CL", "Clothing"),
    ELECTRONICS("EL", "Electronics");

    private final String code;
    private final String label;

    Category(String code, String label){
        this.code = code;
        this.label = label;
    }

    public static Category valueOfcode(String code) {
        for (Category e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }

    public static Category valueOfLabel(String label) {
        for (Category e : values()) {
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
