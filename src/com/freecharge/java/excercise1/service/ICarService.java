package com.freecharge.java.excercise1.service;
import java.util.*;

import com.freecharge.java.excercise1.exception.*;
import com.freecharge.java.excercise1.model.*;

public interface ICarService {
	public List<CarModel> getAllCars();
	public CarModel getCarById(int id) throws CarNotFoundException;
	// public CarModel saveCar(CarModel Car) throws CarAlreadyExistsException;
	// public CarModel updateCar(CarModel Car) throws CarNotFoundException;
	// public boolean deleteCar(CarModel Car) throws CarNotFoundException;
	public CarModel getCarByBrand(String brand) throws CarNotFoundException;
	public CarModel getCarByName(String name) throws CarNotFoundException;
	public CarModel getCarByPrice(double minPrice,double maxPrice) throws CarNotFoundException;
	public CarModel getCarByRating(byte rating) throws CarNotFoundException;
	public double getCarFinalPrice(String memberShip,int id);
	public double maxCarPrice();
}
