package com.freecharge.java.excercise1.service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import com.freecharge.java.excercise1.repository.*;
import com.freecharge.java.excercise1.exception.*;
import com.freecharge.java.excercise1.model.*;

public class CarService implements ICarService{
	CarRepository carRepository;
    public CarService(){
        carRepository=new CarRepository();
    }
    @Override
    public List<Car> getAllCars(){
        return carRepository.getCarsList();
    }
    @Override
    public Car getCarById(int id) throws CarNotFoundException{
        List<Car> cars= carRepository.getCarsList();
        Car Car=null;
//        boolean found=false;
//        for(Car car:cars){
//            if(car.getId()==id){
//                found=true;
//                Car=car;
//            }
//        }
//        if(!found || id<0){
//            throw new CarNotFoundException("Car not found");
//        }
        Optional<Car> findFirst = cars.stream().filter((car)->car.getId()==id).findFirst();
        if(findFirst.isEmpty()) {
        	throw new CarNotFoundException("Car not found");
        }else {
        	Car = findFirst.get();
        }
        return Car;
    }
    @Override
    public Car getCarByBrand(String brand) throws CarNotFoundException{
        List<Car> cars = carRepository.getCarsList();
        Car Car = null;
        boolean found=false;
        // for(Car car:cars){
        //     if(car.getBrand()==brand){
        //         found=true;
        //         Car=car;
        //     }
        // }
        // if(!found || brand==null || brand=="" ){
        //     throw new CarNotFoundException("Car not found");
        // }
        Optional<Car> findFirst = cars.stream().filter((car)->car.getBrand().equals(brand)).findFirst();
        if(findFirst.isEmpty()) {
        	throw new CarNotFoundException("Car not found");
        }else {
        	Car = findFirst.get();
        }
        return Car;
    }
    @Override
    public Car getCarByName(String name) throws CarNotFoundException{
        List<Car> cars = carRepository.getCarsList();
        Car Car = null;
        boolean found=false;
        // for(Car car:cars){
        //     if(car.getName()==name){
        //         found=true;
        //         Car=car;
        //     }
        // }
        // if(!found || name==null || name=="" ){
        //     throw new CarNotFoundException("Car not found");
        // }
        Optional<Car> findFirst = cars.stream().filter((car)->car.getName().equals(name)).findFirst();
        if(findFirst.isEmpty()) {
        	throw new CarNotFoundException("Car not found");
        }else {
        	Car = findFirst.get();
        }
        return Car;
    }
    @Override
    public Car getCarByPrice(double minPrice,double maxPrice) throws CarNotFoundException{
        List<Car> cars = carRepository.getCarsList();
        Car Car = null;
        boolean found=false;
        // for(Car car:cars){
        //     if(car.getPrice()>=minPrice && car.getPrice()<=maxPrice){
        //         found=true;
        //         Car=car;
        //     }
        // }
        // if(!found || minPrice<0.0 || maxPrice<0 || minPrice>maxPrice ){
        //     throw new CarNotFoundException("Car not found");
        // }
        Optional<Car> findFirst = cars.stream().filter((car)->car.getPrice()>=minPrice && car.getPrice()<=maxPrice).findFirst();
        if(findFirst.isEmpty()) {
        	throw new CarNotFoundException("Car not found");
        }else {
        	Car = findFirst.get();
        }
        return Car;
    }
    @Override
    public Car getCarByRating(byte rating) throws CarNotFoundException{
        List<Car> cars = carRepository.getCarsList();
        Car Car = null;
        boolean found=false;
        // for(Car car:cars){
        //     if(car.getRating()>=rating){
        //         found=true;
        //         Car=car;
        //     }
        // }
        // if(!found || rating<0){
        //     throw new CarNotFoundException("Car not found");
        // }
        Optional<Car> findFirst = cars.stream().filter((car)->car.getRating()>=rating).findFirst();
        if(findFirst.isEmpty()) {
        	throw new CarNotFoundException("Car not found");
        }else {
        	Car = findFirst.get();
        }
        return Car;
    }
    @Override
    public double getCarFinalPrice(String memberShip,int id){
        List<Car> cars = carRepository.getCarsList();
        double ans=0.0;
        for(Car car:cars){
            if(car.getId()==id){
                if(memberShip=="Gold"){
                    ans = car.getPrice()*0.90;
                }
                else if(memberShip=="Silver"){
                    ans = car.getPrice()*0.95;
                }
                else if(memberShip=="Diamond"){
                    ans = car.getPrice()*0.85;
                }
            }
        }
        return ans;
    }
    @Override
    public double maxCarPrice(){
        List<Car> cars = carRepository.getCarsList();
        OptionalDouble max = cars.stream().mapToDouble(Car::getPrice).max();
        //System.out.println(max.getAsDouble());
        return max.getAsDouble();
    }
}
