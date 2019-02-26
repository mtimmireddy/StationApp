package com.app.StationFinder.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.StationFinder.entity.StationDetails;

@Repository
public interface StationRepository extends CrudRepository<StationDetails, Long> {
	
	StationDetails createStationDetails(StationDetails stationDetails);
	StationDetails getStationDetailsByName(String name);
	StationDetails getStationDetailsById(String stationId);

}
