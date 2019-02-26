package com.app.StationFinder.mapper;

import com.app.StationFinder.entity.StationDetails;
import com.app.StationFinder.model.Station;

import lombok.Data;


public class StationMapper {

	public Station toDto(StationDetails model) {
		
		if(null == model)
			return null;
		
		Station dto = new Station();
		
		dto.setStationId(model.getStationId());
		dto.setName(model.getName());
		dto.setHdEnabled(model.getHdEnabled());
		dto.setCallSign(model.getCallSign());
		
		return dto;
		
	}
	
	public StationDetails toModel(Station dto) {
		if(null == dto)
			return null;
		
		StationDetails model = new StationDetails();
		
		model.setStationId(dto.getStationId());
		model.setName(dto.getName());
		model.setHdEnabled(dto.getHdEnabled());
		model.setCallSign(dto.getCallSign());
		
		return model;
		
	}
}
