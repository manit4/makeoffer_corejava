package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	AddressService addressService;

	@Transactional
	public void addCompleteDetails() {

		User user = User.builder().name("Manit").email("man@yahoo.com").userId("u_100").build();

		userRepository.save(user);

		addressService.saveAddress("u_100");

		if (true) {

			throw new NullPointerException();
		}
	}

}
