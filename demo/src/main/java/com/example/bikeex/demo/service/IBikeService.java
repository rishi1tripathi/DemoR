package com.example.bikeex.demo.service;

import java.util.ArrayList;

import com.example.bikeex.demo.modal.Bike;

public interface IBikeService {
	public void addBike(Bike bike);
	public Bike retrieveBike(int bikeId);
	public ArrayList<Bike> retrieveAllBikes();
	public void deleteBike(int id);
}
