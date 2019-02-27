package com.app.StationFinder.dao;

import java.util.List;

import com.app.StationFinder.entity.StationDetails;

public interface StationFinderDao {
	
	StationDetails createStationDetails(final StationDetails stationDetails);
	List<StationDetails> getStationDetailsByName(final String name);
	StationDetails getStationDetailsById(final Long stationId);
	StationDetails updateStationDetails(final StationDetails stationDetails);

}
