package com.app.StationFinder.service;

import com.app.StationFinder.model.Station;

public interface StationFinderService {
	
	Station createStation(final Station station);
	Station getStationDetailsByName(String name);
	Station getStationDetailsById(Long stationId);
    Station updateStation(final Station station);
}
