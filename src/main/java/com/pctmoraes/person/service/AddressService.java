package com.pctmoraes.person.service;

import com.pctmoraes.person.controller.dto.AddressFilter;
import com.pctmoraes.person.model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    Address save(Address address);

    List<Address> findAll(AddressFilter addressFilter);

    Optional<Address> findById(Long id);
}
