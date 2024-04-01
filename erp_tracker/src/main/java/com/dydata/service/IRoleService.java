package com.dydata.service;

import java.util.List;

import com.dydata.entity.Role;

public interface IRoleService {
	
	public String createRole(Role role);
	
	public List<Role> getAllRoles();
	
	public void deleteRole(String roleId);

}
