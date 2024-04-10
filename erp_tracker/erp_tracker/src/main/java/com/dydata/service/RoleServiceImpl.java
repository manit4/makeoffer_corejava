package com.dydata.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dydata.entity.Role;
import com.dydata.repository.RoleRepository;

@Service
public class RoleServiceImpl implements IRoleService{
	
	Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public String createRole(Role role) {
		
		logger.info("Inside createRole service()");
		
		roleRepository.save(role);
		
		return "New Role has been created successfully";
	}

	@Override
	public List<Role> getAllRoles() {
		
		List<Role> roles = roleRepository.findAll();;
		
		return roles;
	}

	@Override
	public void deleteRole(String roleId) {
		
		roleRepository.deleteById(roleId);
		
	}
	
}
