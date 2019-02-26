package com.app.StationFinder.service.impl;

import com.app.StationFinder.dao.StationFinderDao;
import com.app.StationFinder.entity.StationDetails;
import com.app.StationFinder.mapper.StationMapper;
import com.app.StationFinder.model.Station;
import com.app.StationFinder.service.StationFinderService;

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
		StationDetails stationRetrieved = stationFinderDao.getStationDetailsByName(name);
		return stationMapper.toDto(stationRetrieved);
	}

	@Override
	public Station getStationDetailsById(String stationId) {
		StationDetails stationById = stationFinderDao.getStationDetailsById(stationId);
		return stationMapper.toDto(stationById);
	}
	
	

}
