package com.wp.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wp.Models.Transporter;

import com.wp.Services.TransporterService;

@Controller
public class TransporterController {

	@Autowired
	private TransporterService transporterService;

	@RequestMapping("removetransporter")
	public ModelAndView deleteTransporter(@RequestParam("email") String email) {

		transporterService.deletetransporter(email);
		ModelAndView mv = new ModelAndView("redirect:viewalltransporters");
		return mv;

	}

	@RequestMapping("viewalltransporters")
	public ModelAndView showAllRecords() {
		List<Transporter> transporters = transporterService.viewAllTransporters();

		ModelAndView mv = new ModelAndView("showtransporters");
		mv.addObject("transporters", transporters);
		return mv;
	}
    
	@RequestMapping("searchtransporterbyname")
	public ModelAndView searchDetaills(@RequestParam("name") String name) {
		Transporter transporter = transporterService.searchTransporter(name);

		ModelAndView mv = new ModelAndView("getdetailTransporter");
		mv.addObject("transporter", transporter);
		return mv;

	}

	@RequestMapping("searchtransporter")
	public String showSearchForm() {
		return "searchTransporter";
	}

	@RequestMapping("remove")
	public String showDeleteForm() {
		return "delete";
	}

	@RequestMapping("LoadDocs")
	public ModelAndView loadDocument(@RequestParam("orgdocuments") String filepath, HttpServletResponse response) 
	{
		
		ModelAndView mv=null;

		try {
		
			String path1="E:/orgdocs";
			File file=new File(path1);
			if(file.exists()){
				System.out.println("check");
				byte b[] =new byte[(int)file.length()];
				FileInputStream fis;
				fis=new FileInputStream(file);
				fis.read(b);
				ServletOutputStream sos= response.getOutputStream();
				sos.write(b);
				fis.close();
				sos.close();
			}
		}
 catch (Exception e)
 {
			e.printStackTrace();
 }
		return mv;
}		
	@RequestMapping("savetransporter")
	public ModelAndView saveTransporterData(@ModelAttribute("transporter") Transporter transporter,
			@RequestParam("orgdocuments") MultipartFile file1, @RequestParam("idproof") MultipartFile file2) {

		String file1name = "Organization docs" + "_" + file1.getOriginalFilename() + "_" + transporter.getEmail();
		String file2name = "Transporter Idproof" + "_" + file2.getOriginalFilename() + "_" + transporter.getEmail();
		String path1 = "E:/orgdocs" + file1name;
		String path2 = "E:/transporteridproof" + file2name;

		try {
			byte b[] = file1.getBytes();
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(path1));
			os.write(b);
			os.flush();
			os.close();
			transporter.setOrgdocs(path1);

			byte br[] = file2.getBytes();
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path2));
			bout.write(br);
			bout.flush();
			bout.close();
			transporter.setIdentity(path2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		transporterService.transporterEntry(transporter);
		ModelAndView mv = new ModelAndView();
		mv.addObject("transporter", transporter);
		return mv;

	}

	@RequestMapping("newtransporter")
	public String showDataEntryForm() {
		return "dataentryTransporter";
	}
	
	

	@RequestMapping("login")
	public String showLoginForm() {
		return "login";
	}

	
}
