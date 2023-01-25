package com.pctmoraes.person.service;

import com.pctmoraes.person.model.PersonAddress;

import java.util.List;
import java.util.Optional;

public interface PersonAddressService {
    PersonAddress save(PersonAddress personAddress);

    List<PersonAddress> findAll();

    Optional<PersonAddress> findById(Long id);
}
