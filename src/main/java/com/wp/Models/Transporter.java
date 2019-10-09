package com.wp.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.wp.Models.Customer;
import com.wp.Models.Vehicle;

@Entity
public class Transporter {

	@Id
	@Column(nullable = false)
	private String email;
	private String name;
	private String password;
	private String cpass;
	private String city;
	private long contact;
	private String orgname;

	private String orgdocs;

	private String identity;
	private String Role = "Transporter";
	
	

  @OneToMany(mappedBy = "transporter")
	private List<Vehicle> vehicle;

	@OneToMany(mappedBy = "transporterdeal")
	private List<TransporterDeal> transporterdeal;

	@ManyToMany
	private List<Customer> customer = new ArrayList<Customer>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getOrgdocs() {
		return orgdocs;
	}

	public void setOrgdocs(String orgdocs) {
		this.orgdocs = orgdocs;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "Transporter [email=" + email + ", name=" + name + ", password=" + password + ", cpass=" + cpass
				+ ", city=" + city + ", contact=" + contact + ", orgname=" + orgname + ", orgdocs=" + orgdocs
				+ ", identity=" + identity + ", Role=" + Role + "]";
	}

}
