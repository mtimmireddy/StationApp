package com.app.StationFinder.entity;


import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "Station_Details")

public class StationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4269850418721274111L;
	
	 @Id @GeneratedValue
	    @Column(name = "Station_Id", unique = true, nullable = false)
	    private String stationId;
	 
	 @Column(name = "Station_Name", unique = true, nullable =false)
	 private String name;
	 
	 @Column(name = "hdEnabled", nullable = false)
	 private Boolean hdEnabled;
	 
	 @Column(name = "Call_Sign", unique = true, nullable = false)
	 private String callSign;
	 
	 
	 @OneToMany
	    @JoinTable(
	            name = "Station_ID_Table",
	            joinColumns = {@JoinColumn(name = "Station_Id")},
	            inverseJoinColumns = {@JoinColumn(name = "Station_Name")}
	    )
	 
	 private ArrayList<StationDetails> stationDetails = new ArrayList<StationDetails>();
	 
	 
	 

}
