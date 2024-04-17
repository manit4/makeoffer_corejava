package com.dydata.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee extends User {
	
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	@Temporal(TemporalType.DATE)
	private Date leavingDate;

}
