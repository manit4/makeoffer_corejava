package com.exadata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exadata.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
