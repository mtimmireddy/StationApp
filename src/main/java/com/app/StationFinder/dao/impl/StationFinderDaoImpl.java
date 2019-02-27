package com.app.StationFinder.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.app.StationFinder.dao.StationFinderDao;
import com.app.StationFinder.entity.StationDetails;
import com.app.StationFinder.repository.StationDetailsRepository;


@Component
public class StationFinderDaoImpl implements StationFinderDao {

	private final StationDetailsRepository stationRepository;
	
	 public StationFinderDaoImpl(final StationDetailsRepository stationRepository) {
	        this.stationRepository = stationRepository;
	 }
	 
	@Override    
	public StationDetails createStationDetails(final StationDetails stationDetails){
	    	   
	    	   return stationRepository.save(stationDetails);
	        	
	        }

	
	  @Override 
	  public List<StationDetails> getStationDetailsByName(String name) {
	  
	  return stationRepository.findByName(name); 
	  }
	 

	@Override
	public StationDetails getStationDetailsById(Long stationId) {
		
		Optional<StationDetails> station = stationRepository.findById(stationId);
	
		return (station.isPresent()) ? station.get() : null;
	}
	
	@Override
	public StationDetails updateStationDetails(final StationDetails stationdetails) {
		return stationRepository.save(stationdetails);
	}
	
}

	
