package com.rhm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhm.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
