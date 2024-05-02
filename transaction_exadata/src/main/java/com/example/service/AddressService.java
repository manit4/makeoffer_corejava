package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Address;
import com.example.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressRepository;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveAddress(String userId) {
		
		Address address = new Address("a_1", "Mumbai", "Maharashtra", userId);
		
		addressRepository.save(address);	
	}

}
