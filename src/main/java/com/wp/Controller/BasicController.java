package com.wp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wp.Models.Transporter;

@Controller
public class BasicController {
	@RequestMapping("contact")
	public String showDataEntryForm() {
		return "contact";
	}
	
	@RequestMapping("transporterhome")
	public String showtransporterhome() {
		return "TransporterHome";
	}
	@RequestMapping("dealentry")
	public String showdealEntryform() {
		Transporter transporter = new Transporter();
		ModelAndView modelAndView = new ModelAndView("dataentryTransportdeal");
		String transporterName = transporter.getName();
		modelAndView.addObject("name", transporterName);
	
		return"dataentryTransportdeal";
	
		
	}
}
