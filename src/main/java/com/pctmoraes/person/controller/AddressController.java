package com.pctmoraes.person.controller;

import com.pctmoraes.person.controller.dto.AddressFilter;
import com.pctmoraes.person.model.Address;
import com.pctmoraes.person.service.impl.AddressServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressServiceImpl addressServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Address save(@RequestBody Address address){
        return addressServiceImpl.save(address);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Address> findAll(AddressFilter addressFilter){
        return addressServiceImpl.findAll(addressFilter);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Address findById(@PathVariable("id") Long id){
        return addressServiceImpl.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Address not found"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateAddress(@PathVariable("id") Long id, @RequestBody Address address){
        addressServiceImpl.findById(id)
                .map(baseAddress -> {
                    modelMapper.map(address, baseAddress);
                    addressServiceImpl.save(baseAddress);
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Address not found"));
    }

}