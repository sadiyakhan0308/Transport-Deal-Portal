package com.wp.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wp.Models.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addVehicle(Vehicle vehicle) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(vehicle);
		tr.commit();
		session.close();
	}

	public void removeVehicle(long regno) {
		Session session = sessionFactory.openSession();
		Vehicle vehicle = session.get(Vehicle.class, regno);
		Transaction tr = session.beginTransaction();
		session.delete(vehicle);
		tr.commit();
		session.close();

	}

	public void updateVehicle(Vehicle vehicle) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(vehicle);
		tr.commit();
		session.close();
	}

	public Vehicle getvehicleByRegno(long regno) {
		Session session = sessionFactory.openSession();
		Vehicle vehicle = session.get(Vehicle.class, regno);
		session.close();
		return vehicle;
	}

	public List<Vehicle> getAllVehicles() {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Vehicle.class);
		List<Vehicle> vehicles = cr.list();
		session.close();
		return vehicles;
	}

}