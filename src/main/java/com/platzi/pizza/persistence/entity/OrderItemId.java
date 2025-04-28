package com.platzi.pizza.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class OrderItemId {
    @Column(name = "id_item", nullable = false, unique = true)
    private Integer idItem;

    @JoinColumn(name = "id_order", referencedColumnName = "id_order", nullable = false)
    @ManyToOne
    private OrderEntity order;
}
