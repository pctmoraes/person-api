package com.pctmoraes.person.service.impl;

import com.pctmoraes.person.controller.dto.PersonFilter;
import com.pctmoraes.person.model.Person;
import com.pctmoraes.person.repository.PersonRepository;
import com.pctmoraes.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{
    private final PersonRepository personRepository;

    public Person save(Person person){
        return personRepository.save(person);
    }

    public List<Person> findAll(PersonFilter personFilter){
        Person person = Person.builder()
                .id(personFilter.getId())
                .name(personFilter.getName())
                .birthDate(personFilter.getBirthDate())
                .build();

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

        Example example = Example.of(person, exampleMatcher);

        return personRepository.findAll(example);
    }

    public Optional<Person> findById(Long id){
        return personRepository.findById(id);
    }

}
