package com.wp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wp.Dao.VehicleDao;
import com.wp.Models.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao daoInterface;

	public void vehicleEntry(Vehicle vehicle) {
		daoInterface.addVehicle(vehicle);

	}

	public void deleteVehicle(long regno) {
		daoInterface.removeVehicle(regno);

	}

	public void changeVehicleDetails(Vehicle vehicle) {
		daoInterface.updateVehicle(vehicle);

	}

	public Vehicle searchVehicle(long regno) {

		return daoInterface.getvehicleByRegno(regno);
	}

	public List<Vehicle> viewAllVehicles() {

		return daoInterface.getAllVehicles();
	}

	public void updateVehicle(Vehicle vehicle) {
		daoInterface.updateVehicle(vehicle);

	}

}