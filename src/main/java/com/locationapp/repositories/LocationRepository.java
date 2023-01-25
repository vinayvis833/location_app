package com.locationapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationapp.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
