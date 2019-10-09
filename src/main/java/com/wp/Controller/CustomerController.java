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

import com.wp.Models.Customer;
import com.wp.Models.TransporterDeal;
import com.wp.Services.CustomerService;
import com.wp.Services.TransporterDealService;
import com.wp.Services.TransporterService;


@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	private TransporterDealService transporterdealService;
	
	@RequestMapping("viewcustomers")
	public ModelAndView showAllCustomers() {
		List<Customer> customers = customerService.viewAllCustomers();

		ModelAndView mv = new ModelAndView("showcustomers");
		mv.addObject("customers", customers);
		return mv;
	}
	
	@RequestMapping("savecustomer")
	public ModelAndView saveCustomerInfo(@ModelAttribute("customer") Customer customer){
		customerService.customerEntry(customer);
		ModelAndView mv=new ModelAndView("showCustomers");
		mv.addObject("Customer",customer);
		return mv;
	}
	@RequestMapping("viewcusdeals")
	public ModelAndView showAllDeals() {
		List<TransporterDeal> transportersdeal = transporterdealService.viewAllTransportersDeals();

		ModelAndView mv = new ModelAndView("showcusdeals");
		mv.addObject("transportersdeal", transportersdeal);
		return mv;
	}

	
	@RequestMapping("newcustomer")
	public String showEntryForm() {
		return "dataentryCustomer";
	}

	@RequestMapping("logincustomer")
	public String showLoginForm() {
		return "login";
	}
}
