package com.pctmoraes.person.controller;

import com.pctmoraes.person.controller.dto.PersonFilter;
import com.pctmoraes.person.model.Person;
import com.pctmoraes.person.service.impl.PersonServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServiceImpl personServiceImpl;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person save(@RequestBody Person person){
        return personServiceImpl.save(person);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> findAll(PersonFilter personFilter){
        return personServiceImpl.findAll(personFilter);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person findById(@PathVariable("id") Long id){
        return personServiceImpl.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Person not found"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updatePerson(@PathVariable("id") Long id, @RequestBody Person person){
        personServiceImpl.findById(id)
                .map(basePerson -> {
                    modelMapper.map(person, basePerson);
                    personServiceImpl.save(basePerson);
                    return Void.TYPE;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Person not found"));
    }

}