package com.wp.Controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wp.Models.Transporter;
import com.wp.Models.TransporterDeal;
import com.wp.Services.TransporterDealService;


@Controller
public class TransporterDealController {

	@Autowired
	private TransporterDealService transporterdealService;

	
	@RequestMapping("savedeal")
	public ModelAndView saveDealInfo(@ModelAttribute("transporterdeal") TransporterDeal transporterdeal){
		transporterdealService.transporterdealEntry(transporterdeal);
		ModelAndView mv=new ModelAndView("");
		mv.addObject("TransporterDeal",transporterdeal);
		return mv;
	}
	
	@RequestMapping("viewdeals")
	public ModelAndView showAllDeals() {
		List<TransporterDeal> transportersdeal = transporterdealService.viewAllTransportersDeals();

		ModelAndView mv = new ModelAndView("showdeals");
		mv.addObject("transportersdeal", transportersdeal);
		return mv;
	}

}
