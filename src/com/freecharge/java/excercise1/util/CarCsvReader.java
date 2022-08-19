package com.freecharge.java.excercise1.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.freecharge.java.excercise1.model.Car;

public class CarCsvReader {
	private static final String CAR_CSV_FILE_PATH  = "C:\\Users\\aniket.rastogi\\eclipse-workspace\\System Design\\data\\car.csv";
	public List<Car> getCarListFromCsv(){
		List<Car> carList = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(new File(CAR_CSV_FILE_PATH)))){
			br.readLine();
			carList = new ArrayList<>();
			String carData = null;
			while( (carData = br.readLine()) != null) {
				String[] carDataSplit = carData.split(",");
				//System.out.println(carData);
				Car car = new Car();
				car.setId(Integer.parseInt(carDataSplit[0]))
					.setName(carDataSplit[1])
					.setBrand(carDataSplit[2])
					.setPrice(Double.parseDouble(carDataSplit[3]))
					.setRating(Byte.parseByte(carDataSplit[4]));
				carList.add(car);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} 
		return carList;
	}
}

//variable names
//Model Car
