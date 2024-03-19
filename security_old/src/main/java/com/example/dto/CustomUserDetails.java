package com.example.dto;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.entity.User;

public class CustomUserDetails implements UserDetails {
	
	User user = null;
	
	public CustomUserDetails(User user) {
		
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		System.out.println("get Authority");
		
		HashSet<SimpleGrantedAuthority> set = new HashSet<>();
		set.add(new SimpleGrantedAuthority(this.user.getRole()));
		
		return set;
	}

	@Override
	public String getPassword() {
		System.out.println("getPasword");
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		System.out.println("get Username");
		
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		System.out.println("inside nonexpired");
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		System.out.println("insdie nonlocked");
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		System.out.println("non expired");
		return true;
	}

	@Override
	public boolean isEnabled() {
		System.out.println("isEnabled...");
		return user.isActive();
	}
}
