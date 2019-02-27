package com.app.StationFinder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NotNull
@JsonPropertyOrder({ "stationId", "name", "hdEnabled", "callSign" })
public class Station implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4770115430331140338L;

	
	@NotNull
	@NotBlank
	@JsonProperty(value = "stationId", required = true)
	private Long stationId;
	
	
	@NotNull
	@JsonProperty(value = "name", required = true)
	private String name;
	
	
	@JsonProperty(value = "hdEnabled", required = true)
	private Boolean hdEnabled;
	
	@NotNull
	@JsonProperty(value = "callSign", required = true)
	private String callSign;

	
	

}
