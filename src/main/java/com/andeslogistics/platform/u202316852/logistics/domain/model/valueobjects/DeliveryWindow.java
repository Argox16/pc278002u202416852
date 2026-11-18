package com.andeslogistics.platform.u202316852.logistics.domain.model.valueobjects;

import java.time.LocalDate;

public record DeliveryWindow(LocalDate startDate, LocalDate endDate) {
    public DeliveryWindow {
        if (startDate == null || endDate == null || !endDate.isAfter(startDate)) {
            throw new IllegalArgumentException("Datos requeridos para empezar");
        }
    }

    public boolean includes(LocalDate checkDate) {
        if (checkDate == null) {
            throw new IllegalArgumentException("A date is required.");
        }
        return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
    }
}
