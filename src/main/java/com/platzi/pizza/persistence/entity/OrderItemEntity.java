package com.platzi.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@Getter
@Setter
public class OrderItemEntity {
    @EmbeddedId
    private OrderItemId itemId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pizza", referencedColumnName = "id_pizza", nullable = false, unique = true)
    private PizzaEntity pizza;

    @Column(columnDefinition = "Decimal(2, 1)", nullable = false)
    private Double quantity;

    @Column(columnDefinition = "Decimal(5, 2)", nullable = false)
    private Double price;
}
