package com.freecharge.java.excercise1.repository;

import java.util.List;
import com.freecharge.java.excercise1.model.*;
import com.freecharge.java.excercise1.util.*;

public class CarRepository {
	private List<Car> carList;
	private CarCsvReader carCsvReader;
	
	public CarRepository() {
		this.carCsvReader=new CarCsvReader();
		this.carList=this.carCsvReader.getCarListFromCsv();
	}
	
	public List<Car> getCarsList(){
		return this.carList;
	}
}
