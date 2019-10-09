package com.wp.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.wp.Models.Transporter;

@Entity
public class Customer {
	@Id
	@Column(nullable=false)
	private String email;
	private String name;
	private String password;
	private String cpass;
	private String city;
	private long contact;
	private String Role="Customer";
	@ManyToMany(mappedBy = "customer")
	List<Transporter> transporter = new ArrayList<Transporter>();
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", password=" + password + ", cpass=" + cpass + ", city="
				+ city + ", contact=" + contact + ", Role=" + Role + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
}
