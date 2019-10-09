package com.wp.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class TransporterDeal {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dealid = 0;
	private String dealstartdate;
	private String dealenddate;
	private String vehiclemodel;
	private String vehicleregno;
	private String pickupcity;
	private String dropcity;
	private long vehiclecapacity;
	@ManyToOne
	private Transporter transporterdeal;

	public String getVehicleregno() {
		return vehicleregno;
	}

	public void setVehicleregno(String vehicleregno) {
		this.vehicleregno = vehicleregno;
	}

	public long getVehiclecapacity() {
		return vehiclecapacity;
	}

	public void setVehiclecapacity(long vehiclecapacity) {
		this.vehiclecapacity = vehiclecapacity;
	}

	private long price;

	public String getDealstartdate() {
		return dealstartdate;
	}

	public void setDealstartdate(String dealstartdate) {
		this.dealstartdate = dealstartdate;
	}

	public String getDealenddate() {
		return dealenddate;
	}

	public void setDealenddate(String dealenddate) {
		this.dealenddate = dealenddate;
	}

	public String getVehiclemodel() {
		return vehiclemodel;
	}

	public void setVehiclemodel(String vehiclemodel) {
		this.vehiclemodel = vehiclemodel;
	}

	public String getPickupcity() {
		return pickupcity;
	}

	public void setPickupcity(String pickupcity) {
		this.pickupcity = pickupcity;
	}

	public String getDropcity() {
		return dropcity;
	}

	public void setDropcity(String dropcity) {
		this.dropcity = dropcity;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getDealid() {
		return dealid;
	}

	public void setDealid(int dealid) {
		this.dealid = dealid;
	}

	public Transporter getTransporterdeal() {
		return transporterdeal;
	}

	public void setTransporterdeal(Transporter transporterdeal) {
		this.transporterdeal = transporterdeal;
	}

	@Override
	public String toString() {
		return "TransporterDeal [dealid=" + dealid + ", dealstartdate=" + dealstartdate + ", dealenddate=" + dealenddate
				+ ", vehiclemodel=" + vehiclemodel + ", vehicleregno=" + vehicleregno + ", pickupcity=" + pickupcity
				+ ", dropcity=" + dropcity + ", vehiclecapacity=" + vehiclecapacity + ", transporterdeal="
				+ transporterdeal + ", price=" + price + "]";
	}

}
