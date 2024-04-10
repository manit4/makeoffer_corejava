package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.to.Contact;

@Service
public class ContactService {
	
	private List<Contact> contacts;
	
	public ContactService() {
		
		contacts = new ArrayList<>();
		
		Contact contact1 = Contact.builder().contactId("c_001").city("New York").country("United States").userid("rong2").build();
		Contact contact3 = new Contact("c_002", "Mumbai", "India", "jian1");
		Contact contact4 = new Contact("c_003", "Beijing", "China", "gar3");
		
		contacts.add(contact1);   contacts.add(contact3);   contacts.add(contact4);
		
	}

	public Contact getContact(String userId) {
		
		Contact finalContact = null;
		
		for(Contact contact : contacts) {
			
			if(contact.getUserid().equals(userId)) {
				
				finalContact = contact;
				break;
			}
		}
		return finalContact;
	}
}
