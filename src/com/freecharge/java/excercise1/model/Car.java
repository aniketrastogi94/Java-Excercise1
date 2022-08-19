package com.freecharge.java.excercise1.model;

public class Car {
	private int id;
	private String name;
	private String brand;
	private double price;
	private byte rating;
	public Car(){
		
	}
	public Car(int id,String name,String brand,double price,byte rating){
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.rating=rating;
	}
	public int getId() {
		return id;
	}
	public Car setId(int id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Car setName(String name) {
		this.name = name;
		return this;
	}
	public String getBrand() {
		return brand;
	}
	public Car setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	public double getPrice() {
		return price;
	}
	public Car setPrice(double price) {
		this.price = price;
		return this;
	}
	public byte getRating() {
		return rating;
	}
	public Car setRating(byte rating) {
		this.rating = rating;
		return this;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + price + ", rating=" + rating + "]";
	}
}
