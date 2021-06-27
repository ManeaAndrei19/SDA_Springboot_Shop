package com.sda.andreimanea.webshop.model;

public enum ProductCategory {
    GROCERY("Grocery"),
    PET_FOOD("Pet food"),
    ELECTRONICS("Electronics"),
    MISCELLANEOUS("Miscellaneous"),
    BEVERAGES("Beverages");
    private final String displayValue;
    ProductCategory(String displayValue) {
        this.displayValue = displayValue;
    }
    public String getDisplayValue() {
        return displayValue;
    }
}