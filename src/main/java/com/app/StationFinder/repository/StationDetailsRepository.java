package com.app.StationFinder.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.StationFinder.entity.StationDetails;

@Repository
public interface StationDetailsRepository extends CrudRepository<StationDetails, Long> {
	
	//StationDetails createStationDetails( final StationDetails stationDetails);
	//StationDetails getStationDetailsByName(final String name);
	//StationDetails getStationDetailsById(final Long stationId)
	
	ArrayList<StationDetails> findByName(String name);
     
	
}
