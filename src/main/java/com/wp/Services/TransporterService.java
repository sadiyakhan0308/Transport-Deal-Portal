package com.wp.Services;

import java.util.List;

import com.wp.Models.Login;
import com.wp.Models.Transporter;

public interface TransporterService {
	public void transporterEntry(Transporter transporter);

	public void deletetransporter(String email);

	public Transporter searchTransporter(String email);

	public void updateTransporter(Transporter transporter);

	public void changeTransporterDetails(Transporter transporter);

	public List<Transporter> viewAllTransporters();
	
	public boolean logintransporter(Login login);

}