package com.petros.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {
	private String firstName;
	private String lastName;
	private String[] favLanguage;
	
	public Student() {}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String[] favLanguage) {
		this.favLanguage = favLanguage;
	}
	
}
