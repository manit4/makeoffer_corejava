package com.dydata.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@MappedSuperclass
public class User {
	
	@Id
	@NotNull
	private String userId;
	@NotBlank
	@NotNull
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private int pincode;
	private String city;
	private String state;
	private String country;
	private String photoLocation;
	private String resumeLocation;
	private String role;
	private String status;

}
