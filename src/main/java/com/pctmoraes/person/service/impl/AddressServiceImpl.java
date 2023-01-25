package com.pctmoraes.person.service.impl;

import com.pctmoraes.person.controller.dto.AddressFilter;
import com.pctmoraes.person.model.Address;
import com.pctmoraes.person.repository.AddressRepository;
import com.pctmoraes.person.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    public Address save(Address address){
        return addressRepository.save(address);
    }

    public List<Address> findAll(AddressFilter addressFilter){
        Address addres = Address.builder()
                .id(addressFilter.getId())
                .addressName(addressFilter.getAddressName())
                .address(addressFilter.getAddress())
                .number(addressFilter.getNumber())
                .zipCode(addressFilter.getZipCode())
                .city(addressFilter.getCity())
                .build();

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Example example = Example.of(addres, exampleMatcher);

        return addressRepository.findAll(example);
    }

    public Optional<Address> findById(Long id){
        return addressRepository.findById(id);
    }

}