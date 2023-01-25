package com.pctmoraes.person.repository;

import com.pctmoraes.person.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
