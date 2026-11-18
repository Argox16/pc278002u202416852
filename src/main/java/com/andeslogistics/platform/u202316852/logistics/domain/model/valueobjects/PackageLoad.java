package com.andeslogistics.platform.u202316852.logistics.domain.model.valueobjects;


public record PackageLoad(Integer quantity, String unit) {
    public PackageLoad {
        if (quantity == null || quantity <= 0 || unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Debe ser una cantidad requerida y no estar en blanco");
        }
    }

    public PackageLoad increaseBy(Integer additionalQuantity) {
        if (additionalQuantity == null || additionalQuantity <= 0 ||
                additionalQuantity > Integer.MAX_VALUE - quantity) {
            throw new IllegalArgumentException("The increment must be positive and fit in an integer.");
        }
        return new PackageLoad(quantity + additionalQuantity, unit);
    }
}
