package com.freecharge.java.excercise1.model;

public class CarModel {
	private int id;
	private String name;
	private String brand;
	private double price;
	private byte rating;
	public CarModel(){
		
	}
	public CarModel(int id,String name,String brand,double price,byte rating){
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.rating=rating;
	}
	public int getId() {
		return id;
	}
	public CarModel setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public CarModel setName(String name) {
		this.name = name;
		return this;
	}
	public String getBrand() {
		return brand;
	}
	public CarModel setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public CarModel setPrice(double price) {
		this.price = price;
		return this;
	}
	public byte getRating() {
		return rating;
	}
	public CarModel setRating(byte rating) {
		this.rating = rating;
		return this;
	}
	@Override
	public String toString() {
		return "CarModel [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", rating=" + rating + "]";
	}
}
