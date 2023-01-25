package com.pctmoraes.person.repository;

import com.pctmoraes.person.model.PersonAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonAddressRepository extends JpaRepository<PersonAddress, Long> {
}
