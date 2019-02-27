package com.app.StationFinder.controller.impl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.StationFinder.controller.StationFinderController;
import com.app.StationFinder.model.Station;
import com.app.StationFinder.service.StationFinderService;

@RestController
@RequestMapping("/station-finder/stations")
public class StationFinderControllerImpl implements StationFinderController {
	
	private final StationFinderService stationFinderService;
	
	public StationFinderControllerImpl(final StationFinderService stationFinderService) {
		this.stationFinderService = stationFinderService;
	}

	@Override
	@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Station> createStationDetails(@Valid @RequestBody final Station station) {
		
		Station createdStation = stationFinderService.createStation(station);
		
		if(null == createdStation)
			return new ResponseEntity<Station>(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Station>(createdStation, HttpStatus.CREATED);
		
	}

	@Override
	@RequestMapping(value = "/{name}", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Station> getStationDetailsByName(String name) {
		
		Station retrievedStation = stationFinderService.getStationDetailsByName(name);
		
		if(null == retrievedStation)
			return new ResponseEntity<Station>(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Station>(retrievedStation, HttpStatus.OK);
	
		
	}

	@Override
	@RequestMapping(value = "/{Station_Id}", method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Station> getStationDetailsById(Long stationId) {
		
		Station retrievedStationById = stationFinderService.getStationDetailsById(stationId);
		
		if(null == retrievedStationById)
			return new ResponseEntity<Station>(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Station>(retrievedStationById, HttpStatus.OK);
		
	}
	
	@Override
	@RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Station> updateStationDetails(@Valid @RequestBody final Station station){
		
		Station updatedStation = stationFinderService.updateStation(station);
		
		return new ResponseEntity<Station>(updatedStation, HttpStatus.OK);
	}

}
