package csce247.state;

import java.util.ArrayList;

public class XboxState implements State{

	private GameConsole gameConsole;
	private ArrayList<String> games;
	
	
	public XboxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
		this.games = new ArrayList<String>();
		games.add("Halo: The Master Cheif Collection");
		games.add("Rainbow Six Seige");
		games.add("Cuphead");
		games.add("Hitman 2");
		games.add("Toy Soilders: Cold War");
	}
	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Home Screen.....");
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
		System.out.println("You are already viewing XBox.");
	}


	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting Nintendo.....");
		gameConsole.setState(gameConsole.getNintendoState());
	}

}
