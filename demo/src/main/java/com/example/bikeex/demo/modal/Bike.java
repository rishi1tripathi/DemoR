package com.example.bikeex.demo.modal;

public class Bike {
	private int id;
	private String name;
	private String model;
	private int pickup;
	
	public Bike(int id, String name, String model, int pickup) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.pickup = pickup;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPickup() {
		return pickup;
	}
	public void setPickup(int pickup) {
		this.pickup = pickup;
	}
	
	

}
