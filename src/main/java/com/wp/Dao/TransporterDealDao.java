package com.wp.Dao;

import java.util.List;

import com.wp.Models.Transporter;
import com.wp.Models.TransporterDeal;


public interface TransporterDealDao {

	public void addTransporterDeal(TransporterDeal transporterdeal);

	public void removeTransporterDeal(Integer dealid );

	public void updateTransporterDeal(TransporterDeal transporterdeal);

	public TransporterDeal gettransporterByDealid(Integer dealid);
	public List<TransporterDeal> getAllTransportersDeal();

}