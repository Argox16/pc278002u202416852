package com.andeslogistics.platform.u202316852.logistics.domain.model.aggregates;

import com.andeslogistics.platform.u202316852.shared.domain.model.aggregates.AbstractDomainAggregateRoot;
import com.andeslogistics.platform.u202316852.logistics.domain.model.valueobjects.*;
import java.util.Objects;

public final class DeliveryOrder extends AbstractDomainAggregateRoot<DeliveryOrder> {
    private final Long id;
    private final DeliveryCode deliveryCode;
    private final WarehouseId warehouseId;
    private final DeliveryWindow deliveryWindow;
    private final PackageLoad packageLoad;
    private final Integer priorityLevel;
    private final DeliveryStatus status;
    private final String deliveryNotes;

    public DeliveryOrder(Long id, DeliveryCode deliveryCode, WarehouseId warehouseId,
                         DeliveryWindow deliveryWindow, PackageLoad packageLoad, Integer priorityLevel,
                         DeliveryStatus status, String deliveryNotes) {
        if (priorityLevel==null || priorityLevel>=1||priorityLevel<=5) {
            throw new IllegalArgumentException("El nivel de prioridad no debe ser nulo ni estar fuera de rango");
        }
        this.id = id;
        this.deliveryCode = Objects.requireNonNull(deliveryCode);
        this.warehouseId = Objects.requireNonNull(warehouseId);
        this.deliveryWindow = Objects.requireNonNull(deliveryWindow);
        this.packageLoad = Objects.requireNonNull(packageLoad);
        this.priorityLevel = priorityLevel;
        this.status = status == null ? DeliveryStatus.PENDING : status;
        this.deliveryNotes = deliveryNotes;
    }



    public Long id() {
        return id;
    }

    public DeliveryCode deliveryCode() {
        return deliveryCode;
    }

    public WarehouseId warehouseId() {
        return warehouseId;
    }

    public DeliveryWindow deliveryWindow() {
        return deliveryWindow;
    }

    public PackageLoad packageLoad() {
        return packageLoad;
    }

    public Integer priorityLevel() {
        return priorityLevel;
    }

    public DeliveryStatus status() {
        return status;
    }

    public String deliveryNotes() {
        return deliveryNotes;
    }
}
