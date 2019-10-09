package com.wp.Controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wp.Models.Vehicle;
import com.wp.Services.VehicleService;



@Controller
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@RequestMapping("removevehicle")
	public ModelAndView deleteTransporter(@RequestParam("regno") long regno) {
        vehicleService.deleteVehicle(regno);
		ModelAndView mv = new ModelAndView("redirect:viewallvehicles");
		return mv;

	}
	
	@RequestMapping("viewallvehicles")
	public ModelAndView showAllRecords() {
		List<Vehicle> vehicles = vehicleService.viewAllVehicles();

		ModelAndView mv = new ModelAndView("vehiclelist");
		mv.addObject("vehicles", vehicles);
		return mv;
	}
	

	@RequestMapping("search")
	public ModelAndView searchDetaills(@RequestParam("regno") long regno) {
		Vehicle vehicle = vehicleService.searchVehicle(regno);

		ModelAndView mv = new ModelAndView("getvehicledetail");
		mv.addObject("vehicle", vehicle);
		return mv;

	}

	@RequestMapping("searchvehicle")
	public String showSearchForm() {
		return "searchVehicle";
	}

	
/*
	@RequestMapping("LoadIdentity")
	public void readIdentity(@RequestParam("name") String email, HttpServletResponse response) {
		response.setContentType("application/pdf");

		Transporter transporter = transporterService.searchTransporter(email);
		Blob blob = transporter.getIdentity();
		byte b[] = null;
		try {
			b = blob.getBytes(1, (int) blob.length());
			ServletOutputStream out = response.getOutputStream();
			out.write(b);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/*@RequestMapping("LoadDocs")
	public void readDocs(@RequestParam("email") String email, HttpServletResponse response) {
		response.setContentType("application/pdf");

		Transporter transporter = transporterService.searchTransporter(email);
		Blob blob = transporter.getOrgdocs();
		byte b[] = null;
		try {
			b = blob.getBytes(1, (int) blob.length());
			ServletOutputStream out = response.getOutputStream();
			out.write(b);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	@RequestMapping("savevehicle")
	public ModelAndView saveVehicleData(@ModelAttribute("vehicle") Vehicle vehicle,
			@RequestParam("drvlicense") MultipartFile file1, @RequestParam("fitcertificate") MultipartFile file2,@RequestParam("insure") MultipartFile file3) {
		
		String file1name="DriverLicense"+"_"+file1.getOriginalFilename()+"_"+vehicle.getRegno();
		String file2name="FitnessCertificate"+"_"+file2.getOriginalFilename()+"_"+vehicle.getRegno();
		String file3name="Insurance"+"_"+file3.getOriginalFilename()+"_"+vehicle.getRegno();
		
		String path1="F://drvlicense"+file1name;
		String path2="F://fitcertificate"+file2name;
		String path3="F://Insurance"+file3name;

		try {
			byte b[] = file1.getBytes();
			BufferedOutputStream os= new BufferedOutputStream(new FileOutputStream(path1));
			os.write(b);
			os.flush();
			os.close();
			vehicle.setDriverlicence(path1);
			

			byte br[] = file2.getBytes();
			BufferedOutputStream bout= new BufferedOutputStream(new FileOutputStream(path2));
			bout.write(br);
			bout.flush();
			bout.close();
			vehicle.setFitnesscertificate(path2);
			
			byte brr[] = file3.getBytes();
			BufferedOutputStream bo= new BufferedOutputStream(new FileOutputStream(path3));
			bo.write(brr);
			bo.flush();
			bo.close();
			vehicle.setInsurance(path3);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vehicleService.vehicleEntry(vehicle);
	    ModelAndView mv = new ModelAndView("showvehicleentry");
		mv.addObject("vehicle",vehicle);
		return mv;

	}

	
	@RequestMapping("newvehicle")
	public String showvehicleEntryForm() {
		return "dataentryVehicle";
	}

	

	
}
