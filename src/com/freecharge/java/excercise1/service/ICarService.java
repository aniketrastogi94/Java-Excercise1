package com.freecharge.java.excercise1.service;
import java.util.*;

import com.freecharge.java.excercise1.exception.*;
import com.freecharge.java.excercise1.model.*;

public interface ICarService {
	public List<Car> getAllCars();
	public Car getCarById(int id) throws CarNotFoundException;
	// public Car saveCar(Car Car) throws CarAlreadyExistsException;
	// public Car updateCar(Car Car) throws CarNotFoundException;
	// public boolean deleteCar(Car Car) throws CarNotFoundException;
	public Car getCarByBrand(String brand) throws CarNotFoundException;
	public Car getCarByName(String name) throws CarNotFoundException;
	public Car getCarByPrice(double minPrice,double maxPrice) throws CarNotFoundException;
	public Car getCarByRating(byte rating) throws CarNotFoundException;
	public double getCarFinalPrice(String memberShip,int id);
	public double maxCarPrice();
}
