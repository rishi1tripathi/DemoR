package com.example.bikeex.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.example.bikeex.demo.modal.Bike;

@Component
public class BikeService  implements IBikeService{
	private  static ArrayList<Bike> bikes = new ArrayList<>();
    static
    {

    Bike b1 = new Bike(1,"bajaj","pulsar",43);
    Bike b2 = new Bike(2,"honda","shyne",35);
    bikes.add(b1) ;
    bikes.add(b2);
    }
    @Override
    public ArrayList<Bike> retrieveAllBikes() {
		return bikes;
	}
    @Override
	public Bike retrieveBike(int bikeId)
	{
		for (Bike b : bikes) {
			if (b.getId() == bikeId)
			{
				return b;
			}
		}
		return null;
		
		
	}
    @Override
	public void addBike(Bike bike) {
		bikes.add(bike);
	}
	@Override
	public void deleteBike(int id) {
		
		for (Bike b : bikes) {
			if (b.getId() == id)
			{
				bikes.remove(b);
				return;
			}
		}
		return ;
		
		
	}
	@Override
	public ArrayList<Bike> updateBike(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
