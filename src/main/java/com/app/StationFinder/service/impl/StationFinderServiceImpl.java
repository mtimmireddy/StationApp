package com.app.StationFinder.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.StationFinder.dao.StationFinderDao;
import com.app.StationFinder.entity.StationDetails;
import com.app.StationFinder.mapper.StationMapper;
import com.app.StationFinder.model.Station;
import com.app.StationFinder.service.StationFinderService;

@Service
public class StationFinderServiceImpl implements StationFinderService {
	
	private StationFinderDao stationFinderDao;
	private StationMapper stationMapper;
	
	public StationFinderServiceImpl(final StationFinderDao stationFinderDao) {
		this.stationFinderDao = stationFinderDao;
		this.stationMapper = new StationMapper();;
		
	}

	@Override
	public Station createStation(Station station) {
		StationDetails stationdetails = stationMapper.toModel(station);
       StationDetails createdStation = stationFinderDao.createStationDetails(stationdetails);
        return stationMapper.toDto(createdStation);
	}

	@Override
	public Station getStationDetailsByName(String name) {
		List<StationDetails> stationRetrieved = stationFinderDao.getStationDetailsByName(name);
		return stationMapper.toDto((StationDetails) stationRetrieved);
	}

	@Override
	public Station getStationDetailsById(Long stationId) {
		StationDetails stationById = stationFinderDao.getStationDetailsById(stationId);
		return stationMapper.toDto(stationById);
	}
	
	@Override
	public Station updateStation(Station station) {
		StationDetails stationDetails = stationMapper.toModel(station);
		
		StationDetails updatedStation = stationFinderDao.updateStationDetails(stationDetails);
		return stationMapper.toDto(updatedStation);
	}
	
	

}
