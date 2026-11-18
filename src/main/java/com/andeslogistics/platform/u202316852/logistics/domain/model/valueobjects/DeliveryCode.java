package com.andeslogistics.platform.u202316852.logistics.domain.model.valueobjects;

public record DeliveryCode(String code) {
    public DeliveryCode {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Delivery code is required.");
        }
    }

}
