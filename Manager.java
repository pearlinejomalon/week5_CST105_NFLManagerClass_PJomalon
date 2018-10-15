/**Program: NFL Player Manager Class
*File: Manager.java
*Summary: Design, implement and test the NFL Manager Player Class
*Author: Pearl Jomalon
Date: October 14, 2018
**/


package nfldraft;

import java.util.*;

public class Manager { //Begin Manager Class

	private static ArrayList <Player> PLAYER_LIST = new ArrayList<Player>();  //Create ArrayList
	
	
	public Manager() {   //Create Manager method
		createPlayers();
	}
	
	//List players and stats
	//Add to ArrayList
	public static void createPlayers() {
		Player tbrady = new Player("Tom Brady", "New England Patriots", "Offense", "QB", 41, 18, 488, 0, 0, 0);
		Player eelliott = new Player("Ezekiel Elliott", "Dallas Cowboys", "Offense", "RB", 23, 28, 80, 0, 0, 0);
		Player damendola = new Player();
		Player vmiller = new Player("Von Miller", "Denver Broncos", "Defense", "LB", 29, 8, 2, 0, 337, 1);
		Player jwatt = new Player("J.J. Watt", "Houston Texans", "Defense", "DE", 29, 8, 2, 0, 326, 1);
		Player ppeterson = new Player("Patrick Peterson", "Arizona Cardinals", "Defense", "CB", 28, 8, 1, 0, 326, 22);
		
		PLAYER_LIST.add(tbrady);
		PLAYER_LIST.add(eelliott);
		PLAYER_LIST.add(damendola);
		PLAYER_LIST.add(vmiller);
		PLAYER_LIST.add(jwatt);
		PLAYER_LIST.add(ppeterson);
		
	}
	
	//Create toString method
	public String toString() {
		String playerList = "";
		for(Player player : PLAYER_LIST)
			playerList += (player.name + " " + "\n");
		return playerList;
	}
	
	//Add main method
	//Test string, getter and setter
	public static void main(String[] args) {
		Manager test = new Manager();
		System.out.println("String Test:\n\nPlayers in this NFL Draft are: \n" + test.toString());
		System.out.println("Getter Test: \nTom Brady is " + Manager.PLAYER_LIST.get(0).getAge() + " years old. He is the " + Manager.PLAYER_LIST.get(0).getPosition() + " for the " + Manager.PLAYER_LIST.get(0).getTeamName() + ".");
		
		Manager.PLAYER_LIST.get(2).setName("Ezekiel Elliott");
		Manager.PLAYER_LIST.get(2).setPosition("RB");
		Manager.PLAYER_LIST.get(2).setTeamName("Dallas Cowboys");
		System.out.println("\nSetter Test:\n" + Manager.PLAYER_LIST.get(2).getName() + " plays for the " + Manager.PLAYER_LIST.get(2).getTeamName() + " as a " + Manager.PLAYER_LIST.get(2).getPosition() + ".");
		
	}
}
