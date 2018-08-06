package com.example.bikeex.demo.controller;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bikeex.demo.modal.Bike;
import com.example.bikeex.demo.service.IBikeService;

@RestController
@RequestMapping
public class BikeController {
	
	@Autowired
	private IBikeService bikeService;

	@GetMapping("/bike")
    public ArrayList<Bike> retrieveAllBikes()
	{  
		return bikeService.retrieveAllBikes();
	}
	@GetMapping("/bike/{id}")
	public Bike retrieveBike(@PathVariable int id) {
		return bikeService.retrieveBike(id);
	}
	
	@PostMapping("/bike")
	public void addBike(@RequestBody Bike bike) {
		 bikeService.addBike(bike);
		
	}
	@DeleteMapping("/bike/{id}")
	public void deleteStudent(@PathVariable int id) {
		bikeService.deleteBike(id);
	}
	
	

	
}