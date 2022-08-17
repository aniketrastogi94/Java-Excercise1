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
    public List<CarModel> getAllCars(){
        return carRepository.getCarsList();
    }
    @Override
    public CarModel getCarById(int id) throws CarNotFoundException{
        List<CarModel> cars= carRepository.getCarsList();
        CarModel Car=null;
//        boolean found=false;
//        for(CarModel car:cars){
//            if(car.getId()==id){
//                found=true;
//                Car=car;
//            }
//        }
//        if(!found || id<0){
//            throw new CarNotFoundException("Car not found");
//        }
        Optional<CarModel> findFirst = cars.stream().filter((car)->car.getId()==id).findFirst();
        if(findFirst.isEmpty()) {
        	throw new CarNotFoundException("Car not found");
        }else {
        	Car = findFirst.get();
        }
        return Car;
    }
    @Override
    public CarModel getCarByBrand(String brand) throws CarNotFoundException{
        List<CarModel> cars = carRepository.getCarsList();
        CarModel Car = null;
        boolean found=false;
        for(CarModel car:cars){
            if(car.getBrand()==brand){
                found=true;
                Car=car;
            }
        }
        if(!found || brand==null || brand=="" ){
            throw new CarNotFoundException("Car not found");
        }
        return Car;
    }
    @Override
    public CarModel getCarByName(String name) throws CarNotFoundException{
        List<CarModel> cars = carRepository.getCarsList();
        CarModel Car = null;
        boolean found=false;
        for(CarModel car:cars){
            if(car.getName()==name){
                found=true;
                Car=car;
            }
        }
        if(!found || name==null || name=="" ){
            throw new CarNotFoundException("Car not found");
        }
        return Car;
    }
    @Override
    public CarModel getCarByPrice(double minPrice,double maxPrice) throws CarNotFoundException{
        List<CarModel> cars = carRepository.getCarsList();
        CarModel Car = null;
        boolean found=false;
        for(CarModel car:cars){
            if(car.getPrice()>=minPrice && car.getPrice()<=maxPrice){
                found=true;
                Car=car;
            }
        }
        if(!found || minPrice<0.0 || maxPrice<0 || minPrice>maxPrice ){
            throw new CarNotFoundException("Car not found");
        }
        return Car;
    }
    @Override
    public CarModel getCarByRating(byte rating) throws CarNotFoundException{
        List<CarModel> cars = carRepository.getCarsList();
        CarModel Car = null;
        boolean found=false;
        for(CarModel car:cars){
            if(car.getRating()>=rating){
                found=true;
                Car=car;
            }
        }
        if(!found || rating<0){
            throw new CarNotFoundException("Car not found");
        }
        return Car;
    }
    @Override
    public double getCarFinalPrice(String memberShip,int id){
        List<CarModel> cars = carRepository.getCarsList();
        double ans=0.0;
        for(CarModel car:cars){
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
        List<CarModel> cars = carRepository.getCarsList();
        OptionalDouble max = cars.stream().mapToDouble(CarModel::getPrice).max();
        //System.out.println(max.getAsDouble());
        return max.getAsDouble();
    }
}
