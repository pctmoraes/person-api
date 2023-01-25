package com.pctmoraes.person.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "address_name", nullable = false)
    private String addressName;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "number", nullable = false)
    private Long number;
    @Column(name = "zip_code", nullable = false)
    private String zipCode;
    @Column(name = "city", nullable = false)
    private String city;

}
