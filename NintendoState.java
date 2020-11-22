package csce247.state;

import java.util.ArrayList;
/**
 * One of the three states, used to represent when the nintendo console is selected. Methods switch between
 * states and print messages. Also displays an arraylist of games.
 * @author zacharystthomas
 *
 */
public class NintendoState implements State {

	private GameConsole gameConsole;
	private ArrayList<String> games;
	/**
	 * Constructor.
	 * Adds string values to games ArrayList.
	 * @param gameConsole: Instance of gameConsole to set this class's GameConsole as.
	 *
	 */
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
		this.games = new ArrayList<String>(); 
		games.add("Legend of Zelda: Breath of the Wild");
		games.add("Mario Kart 8");
		games.add("Super Mario Party");
		games.add("Downwell");
		games.add("Minecraft");
	}
	/**
	 * Changes gameConsole's state varaible to the HomeState instance used by gameConsole, and informs user.
	 */
	public void pressHomeButton() {
	
		System.out.println("Displaying Home Screen....");
		gameConsole.setState(gameConsole.getHomeState());
	}

	/**
	 * Prints out the games ArrayList.
	 */
	public void pressGameButton() {
		
		System.out.println("You have the following games: ");
		for(String game : games){
			System.out.println(game);
	
		}
	}

	/**
	 *  Changes gameConsole's state varaible to the XboxState instance used by gameConsole, and informs user.
	 */
	public void pressXboxButton() {
	
		System.out.println("Starting XBox....");
		gameConsole.setState(gameConsole.getxBoxState());
	}

	/**
	 * Informs user the NintendoState is already being viewed.
	 */
	public void pressNintendoButton() {
	
		System.out.println("You are already viewing Nintendo");
	}

}
