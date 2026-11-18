package com.andeslogistics.platform.u202316852.logistics.domain.model.valueobjects;

import java.util.UUID;

public record WarehouseId(UUID value) {
    public WarehouseId {
        if (value == null) {
           throw new IllegalArgumentException("El argumento es invalido y el valor no debe ser nulo");
        }
    }

}
