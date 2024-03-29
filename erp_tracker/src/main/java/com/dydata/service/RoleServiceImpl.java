package com.dydata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dydata.entity.Role;
import com.dydata.repository.RoleRepository;

@Service
public class RoleServiceImpl implements IRoleService{
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public String createRole(Role role) {
		
		roleRepository.save(role);
		
		return "New Role has been created successfully";
	}
}
