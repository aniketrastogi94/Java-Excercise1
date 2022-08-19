package com.freecharge.java.excercise1.model;

public class User {
	private int id;
	private String email;
	private String name;
	private String contactNo;
	private String memberShip;
	public User() {}
	public User(int id,String email,String name,String contactNo,String memberShip){
		this.id=id;
		this.email=email;
		this.name=name;
		this.contactNo=contactNo;
		this.memberShip=memberShip;
	}
	public int getId() {
		return id;
	}
	public User setId(int id) {
		this.id = id;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getName() {
		return name;
	}
	public User setName(String name) {
		this.name = name;
		return this;
	}
	public String getContactNo() {
		return contactNo;
	}
	public User setContactNo(String contactNo) {
		this.contactNo = contactNo;
		return this;
	}
	public String getMemberShip() {
		return memberShip;
	}
	public User setMemberShip(String memberShip) {
		this.memberShip = memberShip;
		return this;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", name=" + name + ", contactNo=" + contactNo
				+ ", memberShip=" + memberShip + "]";
	}
	
}
