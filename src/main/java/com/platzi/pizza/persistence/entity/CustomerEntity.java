package com.platzi.pizza.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class CustomerEntity {
    @Id
    @Column(name = "id_customer", length = 15, nullable = false)
    private String idCustomer;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(length = 100)
    private String address;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
}
