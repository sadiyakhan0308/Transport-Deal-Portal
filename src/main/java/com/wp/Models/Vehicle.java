package com.wp.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.wp.Models.Transporter;

@Entity
public class Vehicle {
	@Id
	@Column(name = "Vechicle_Registration_Number", nullable = false)
	private long regno;
	private String model;
	private String brand;
	private String drivername;
	private String driverlicense;
	private String fitnesscertificate;
	private String insurance;

	@ManyToOne
	private Transporter transporter;

	public long getRegno() {
		return regno;
	}

	public void setRegno(long regno) {
		this.regno = regno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getDriverlicence() {
		return driverlicense;
	}

	public void setDriverlicence(String driverlicence) {
		this.driverlicense = driverlicence;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", model=" + model + ", brand=" + brand + ", drivername=" + drivername
				+ ", driverlicense=" + driverlicense + ", fitnesscertificate=" + fitnesscertificate + ", insurance="
				+ insurance + ", transporter=" + transporter + "]";
	}

	public String getFitnesscertificate() {
		return fitnesscertificate;
	}

	public void setFitnesscertificate(String fitnesscertificate) {
		this.fitnesscertificate = fitnesscertificate;
	}

}
