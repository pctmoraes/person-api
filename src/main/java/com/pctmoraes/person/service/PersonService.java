package com.pctmoraes.person.service;

import com.pctmoraes.person.controller.dto.PersonFilter;
import com.pctmoraes.person.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);

    List<Person> findAll(PersonFilter personFilter);

    Optional<Person> findById(Long id);
}
