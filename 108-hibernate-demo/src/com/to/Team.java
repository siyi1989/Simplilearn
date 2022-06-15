package com.to;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table

public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teamID;
	private String teamName;
	
	public Team() {
		
	}

	
	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}


	public int getTeamID() {
		return teamID;
	}

	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
}
