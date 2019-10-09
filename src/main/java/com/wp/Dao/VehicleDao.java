package com.wp.Dao;

import java.util.List;

import com.wp.Models.Vehicle;

public interface VehicleDao {

	public void addVehicle(Vehicle vehicle);

	public void removeVehicle(long regno);

	public void updateVehicle(Vehicle vehicle);

	public Vehicle getvehicleByRegno(long regno);

	public List<Vehicle> getAllVehicles();

}