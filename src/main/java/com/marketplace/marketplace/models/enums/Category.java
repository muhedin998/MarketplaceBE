package com.marketplace.marketplace.models.enums;

public enum Category {
    CARS("Cars"),
    COMPUTERS("Computers"),
    FURNITURE("Furniture");

    private final String value;

    Category (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // (optional) You can add a static method to convert from string to enum
    public static Category fromValue(String value) {
        for (Category status : Category.values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid Status value: " + value);
    }
}
