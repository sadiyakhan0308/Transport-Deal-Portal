package com.wp.Services;

import java.util.List;


import com.wp.Models.TransporterDeal;

public interface TransporterDealService {
	public void transporterdealEntry(TransporterDeal transporterdeal);

	public void deletetransporterdeal(Integer dealid);

	public void updateTransporterDeal(TransporterDeal transporterdeal);


	public List<TransporterDeal> viewAllTransportersDeals();

}