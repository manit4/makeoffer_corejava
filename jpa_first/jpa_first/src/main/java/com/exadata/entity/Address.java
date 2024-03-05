package com.exadata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
	
	@Id
	private int address_id;
	private String city;
	
//	@OneToOne
//	@JoinColumn(name = "s_id")
//	private Student student;
	
	@ManyToOne
	private Student student;
	

}
