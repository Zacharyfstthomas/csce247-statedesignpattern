package csce247.state;

import java.util.ArrayList;
/**
 * One of the three states, used to represent when the xbox console is selected. Methods switch between
 * states and print messages. Also displays an arraylist of games.
 * @author zacharystthomas
 *
 */
public class XboxState implements State{

	private GameConsole gameConsole;
	private ArrayList<String> games;
	
	/**
	 * Constructor.
	 * Adds string values to games ArrayList.
	 * @param gameConsole: Instance of gameConsole to set this class's GameConsole as.
	 *
	 */
	public XboxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
		this.games = new ArrayList<String>();
		games.add("Halo: The Master Cheif Collection");
		games.add("Rainbow Six Seige");
		games.add("Cuphead");
		games.add("Hitman 2");
		games.add("Toy Soilders: Cold War");
	}
	/**
	 * Changes gameConsole's state varaible to the HomeState instance used by gameConsole, and informs user.
	 */
	public void pressHomeButton() {
		
		System.out.println("Displaying Home Screen.....");
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
	 * Informs user the XboxState is already being viewed.
	 */

	public void pressXboxButton() {
		
		System.out.println("You are already viewing XBox.");
	}

	/**
	 * Changes gameConsole's state varaible to the NintendoState instance used by gameConsole, and informs user.
	 */
	public void pressNintendoButton() {
		
		System.out.println("Starting Nintendo.....");
		gameConsole.setState(gameConsole.getNintendoState());
	}

}
