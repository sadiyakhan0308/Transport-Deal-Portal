package com.wp.Services;

import java.util.List;

import com.wp.Models.Vehicle;

public interface VehicleService {
	public void vehicleEntry(Vehicle vehicle);

	public void deleteVehicle(long regno);

	public Vehicle searchVehicle(long regno);

	public void updateVehicle(Vehicle vehicle);

	public void changeVehicleDetails(Vehicle vehicle);

	public List<Vehicle> viewAllVehicles();

}