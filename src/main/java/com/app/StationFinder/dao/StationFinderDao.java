package com.app.StationFinder.dao;

import com.app.StationFinder.entity.StationDetails;

public interface StationFinderDao {
	
	StationDetails createStationDetails(StationDetails stationDetails);
	StationDetails getStationDetailsByName(String name);
	StationDetails getStationDetailsById(String stationId);

}
