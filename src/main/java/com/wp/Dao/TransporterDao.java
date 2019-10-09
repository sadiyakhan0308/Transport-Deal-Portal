package com.wp.Dao;

import java.util.List;

import com.wp.Models.Transporter;

public interface TransporterDao {

	public void addTransporter(Transporter transporter);

	public void removeTransporter(String email);

	public void updateTransporter(Transporter transporter);

	public Transporter gettransporterByEmailid(String email);

	public List<Transporter> getAllTransporters();

}