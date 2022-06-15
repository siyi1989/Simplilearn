package com.to;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table
public class Player {
	
	@Id
	private int playerId;
	private String playerName;
//	@OneToOne
//	private Team team;
	@OneToMany
	List<Team> teamList= new ArrayList<>();
	private int age;
	
	
	public List<Team> getTeamList() {
		return teamList;
	}



	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}



	public Player() {
		
	}

	
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", team=" + teamList + ", age=" + age
				+ "]";
	}

	

//	public Player(int playerId, String playerName, Team team, int age) {
//		super();
//		this.playerId = playerId;
//		this.playerName = playerName;
//		this.team = team;
//		this.age = age;
//	}



//	public Team getTeam() {
//		return team;
//	}
//
//
//
//	public void setTeam(Team team) {
//		this.team = team;
//	}



	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

//	public String getTeamName() {
//		return teamName;
//	}
//
//	public void setTeamName(String teamName) {
//		this.teamName = teamName;
//	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
