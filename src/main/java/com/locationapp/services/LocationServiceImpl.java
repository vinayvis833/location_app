package com.locationapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationapp.entities.Location;
import com.locationapp.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void save(Location location) {
		locationRepo.save(location);
		
	}

	@Override
	public List<Location> findAll() {
		List<Location> findAll = locationRepo.findAll();
		return findAll;
	}

	@Override
	public void delete(Long id) {
		locationRepo.deleteById(id);
		locationRepo.findAll();
	}

	@Override
	public Location update(Long id) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		return location;
	}

}
