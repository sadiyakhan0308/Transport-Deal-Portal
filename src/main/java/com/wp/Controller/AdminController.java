package com.wp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {
	@RequestMapping("AdminHome")
	public String showDataEntryForm() {
		return "AdminHome";
	}
	

}
