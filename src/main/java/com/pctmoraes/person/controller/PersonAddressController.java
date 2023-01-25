package com.pctmoraes.person.controller;

import com.pctmoraes.person.model.PersonAddress;
import com.pctmoraes.person.service.impl.PersonAddressServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/personaddress")
public class PersonAddressController {
    @Autowired
    private PersonAddressServiceImpl personAddressServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonAddress save(@RequestBody PersonAddress personAddress){
        return personAddressServiceImpl.save(personAddress);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PersonAddress> findAll(){
        return personAddressServiceImpl.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonAddress findById(@PathVariable("id") Long id){
        return personAddressServiceImpl.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Person address not found"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePersonAddress(@PathVariable("id") Long id, @RequestBody PersonAddress personAddress){
        personAddressServiceImpl.findById(id)
                .map(basePersonAddress -> {
                    modelMapper.map(personAddress, basePersonAddress);
                    personAddressServiceImpl.save(basePersonAddress);
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Person address not found"));
    }

}