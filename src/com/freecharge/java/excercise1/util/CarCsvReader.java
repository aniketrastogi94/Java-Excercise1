package com.freecharge.java.excercise1.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.freecharge.java.excercise1.model.CarModel;

public class CarCsvReader {
	private static final String car_csv_file_path = "C:\\Users\\aniket.rastogi\\eclipse-workspace\\System Design\\data\\car.csv";
	public List<CarModel> getCarListFromCsv(){
		List<CarModel> CarList = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(car_csv_file_path)))){
			br.readLine();
			CarList = new ArrayList<>();
			String empData = null;
			while( (empData = br.readLine()) != null) {
				String[] carDataSplit = empData.split(",");
				System.out.println(empData);
				CarModel car = new CarModel();
				car.setId(Integer.parseInt(carDataSplit[0]))
					.setName(carDataSplit[1])
					.setBrand(carDataSplit[2])
					.setPrice(Double.parseDouble(carDataSplit[3]))
					.setRating(Byte.parseByte(carDataSplit[4]));
				CarList.add(car);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} 
		return CarList;
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		CarCsvReader e= new CarCsvReader();
		List<CarModel>Cars = e.getCarListFromCsv();
		for(CarModel car:Cars) {
			System.out.println(car.getId());
		}
	}
	
}
