package com.pctmoraes.person.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressFilter {
    private Long id;
    private String addressName;
    private String address;
    private Long number;
    private String zipCode;
    private String city;
}
