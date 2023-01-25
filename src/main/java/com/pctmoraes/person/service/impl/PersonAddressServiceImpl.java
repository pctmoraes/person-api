package com.pctmoraes.person.service.impl;

import com.pctmoraes.person.model.PersonAddress;
import com.pctmoraes.person.repository.PersonAddressRepository;
import com.pctmoraes.person.service.PersonAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PersonAddressServiceImpl implements PersonAddressService {
    private final PersonAddressRepository personAddressRepository;

    public PersonAddress save(PersonAddress personAddress){
        return personAddressRepository.save(personAddress);
    }

    public List<PersonAddress> findAll(){
        return personAddressRepository.findAll();
    }

    public Optional<PersonAddress> findById(Long id){
        return personAddressRepository.findById(id);
    }

}
