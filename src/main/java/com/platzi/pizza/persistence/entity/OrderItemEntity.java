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
    private OrderItemId orderItemId;

    @Column(name = "id_pizza")
    private Integer idPizza;

    @Column(columnDefinition = "Decimal(2, 1)", nullable = false)
    private Double quantity;

    @Column(columnDefinition = "Decimal(5, 2)", nullable = false)
    private Double price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pizza", referencedColumnName = "id_pizza", nullable = false, unique = true, insertable = false, updatable = false)
    private PizzaEntity pizza;

    @JoinColumn(name = "orderItemId.id_order", referencedColumnName = "id_order", nullable = false, insertable = false, updatable = false)
    @ManyToOne
    private OrderEntity order;
}
