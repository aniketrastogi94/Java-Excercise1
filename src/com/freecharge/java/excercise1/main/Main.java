package com.freecharge.java.excercise1.main;
import java.util.List;
import com.freecharge.java.excercise1.model.*;
import com.freecharge.java.excercise1.service.*;

public class Main {
	public static void main(String[] args) {
		try {
			CarService carService = new CarService();
			// get all cars
			System.out.println(carService.getAllCars());
			
			//find car with id
			System.out.println("Car found with id 1: "+carService.getCarById(1));
			
			// searching with car name
			System.out.println( "Car found with name R1:"+carService.getCarByName("R1"));
			
			//searching car with brand
			System.out.println("car found with brand :"+carService.getCarByBrand("AUDI"));
			
			//searching with rating
			byte rating=5;
			System.out.println("Car found with rating 5: "+carService.getCarByRating(rating));
			
			//finding final price of a car using id and memberShip
			System.out.println("final price of car: "+carService.getCarFinalPrice("Gold", 1));
			
			//max price of a car using stream
			System.out.println("maximum price of a car: "+carService.maxCarPrice());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
