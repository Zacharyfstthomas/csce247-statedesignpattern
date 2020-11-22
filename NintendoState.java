package csce247.state;

import java.util.ArrayList;

public class NintendoState implements State {

	private GameConsole gameConsole;
	private ArrayList<String> games;
	
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
		this.games = new ArrayList<String>();
		games.add("Legend of Zelda: Breath of the Wild");
		games.add("Mario Kart 8");
		games.add("Super Mario Party");
		games.add("Downwell");
		games.add("Minecraft");
	}
	
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Home Screen....");
		gameConsole.setState(gameConsole.getHomeState());
	}

	
	public void pressGameButton() {
		// TODO Auto-generated method stub
		System.out.println("You have the following games: ");
		for(String game : games){
			System.out.println(game);
	
		}
	}

	
	public void pressXboxButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting XBox....");
		gameConsole.setState(gameConsole.getxBoxState());
	}

	
	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		System.out.println("You are already viewing Nintendo");
	}

}
