package com.wp.Controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.wp.Models.Admin;
import com.wp.Models.Customer;
import com.wp.Models.Login;
import com.wp.Models.Transporter;
import com.wp.Services.AdminServiceImpl;
import com.wp.Services.CustomerServiceImpl;

import com.wp.Services.TransporterServiceImpl;

@Controller
public class LoginController {
	@Autowired
	private TransporterServiceImpl transporterServiceImpl;

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@Autowired
	private AdminServiceImpl adminServiceImpl;

	@RequestMapping("validate")
	public ModelAndView CheckCredentials(@ModelAttribute("credentials") Login login, HttpServletResponse response) {

		boolean transporterexist = transporterServiceImpl.logintransporter(login);
		boolean customerexist = customerServiceImpl.logincustomer(login);
		boolean adminexist = adminServiceImpl.loginadmin(login);

		if (transporterexist == true) {
			Transporter transporter = transporterServiceImpl.searchTransporter(login.getEmail());
			String transporterName = transporter.getName();

			ModelAndView modelAndView = new ModelAndView("TransporterHome");
			modelAndView.addObject("login", login);
			modelAndView.addObject("name", transporterName);
			return modelAndView;

		} else if (customerexist == true) {
			Customer customer = customerServiceImpl.searchCustomer(login.getEmail());
			String customername = customer.getName();
			// daoInterface.add(login);
			ModelAndView modelAndView = new ModelAndView("CustomerHome");
			modelAndView.addObject("login", login);
			modelAndView.addObject("name", customername);

			return modelAndView;
		} 
		else if (adminexist == true) {
			Admin admin = adminServiceImpl.searchAdmin(login.getEmail());
			String adminname = admin.getName();

			ModelAndView modelAndView = new ModelAndView("AdminHome");
			modelAndView.addObject("login", login);
			modelAndView.addObject("name", adminname);
			//modelAndView.addObject("titlebar", adminname);
			//modelAndView.addObject("welcome", "Register Yourself first");

			return modelAndView;

		}

		else {
			ModelAndView modelAndView = new ModelAndView("index.jsp");
			modelAndView.addObject("welcome", "Register Yourself first");

			return modelAndView;
		}

	}

}
