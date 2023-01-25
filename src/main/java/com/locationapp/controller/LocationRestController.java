package com.locationapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locationapp.entities.Location;
import com.locationapp.repositories.LocationRepository;

@RestController
@RequestMapping("/location/api")
public class LocationRestController {
	@Autowired
	private LocationRepository locationRepo;
	//Repository layer help us to perform crud operation
	@GetMapping
	//http://localhost:8081/location/api
	public List<Location> getPostman() {
		return locationRepo.findAll();
		
	}
	
	@PostMapping
	//localhost:8081/location/api
	public Location postPostMan(@RequestBody Location location) {
		return locationRepo.save(location);
		
	}
	@PutMapping
	//localhost:8081/location/api
	public void putPostman(@RequestBody Location location) {
		locationRepo.save(location);
	}
	
	@DeleteMapping
	//localhost:8081/location/api/2
	public void deletePostman(@PathVariable("id") Long id) {
		locationRepo.deleteById(id);
	}
	
}
