package com.app.StationFinder.dao.impl;

import com.app.StationFinder.dao.StationFinderDao;
import com.app.StationFinder.entity.StationDetails;
import com.app.StationFinder.repository.StationRepository;

public class StationFinderDaoImpl implements StationFinderDao {

	private final StationRepository stationRepository;
	
	 public StationFinderDaoImpl(final StationRepository stationRepository) {
	        this.stationRepository = stationRepository;
	 }
	 
	@Override    
	public StationDetails createStationDetails(final StationDetails stationDetails){
	    	   
	    	   return stationRepository.save(stationDetails);
	        	
	        }

	@Override
	public StationDetails getStationDetailsByName(String name) {
		
		return stationRepository.getStationDetailsByName(name);
	}

	@Override
	public StationDetails getStationDetailsById(String stationId) {
	
		return stationRepository.getStationDetailsById(stationId);
	}
	
}

	
