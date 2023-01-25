package com.locationapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.locationapp.entities.Location;


public interface LocationService {

	public void save(Location location);
	public List<Location> findAll();
	public void delete(Long id);
	public Location update(Long id);

}
