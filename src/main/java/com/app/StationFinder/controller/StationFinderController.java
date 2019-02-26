package com.app.StationFinder.controller;

import org.springframework.http.ResponseEntity;


import com.app.StationFinder.model.Station;

public interface StationFinderController {
	
	ResponseEntity<Station> createStationDetails(Station station);
	ResponseEntity<Station> getStationDetailsByName(String name);
	ResponseEntity<Station> getStationDetailsById(String stationId);
	
}
