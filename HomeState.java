package csce247.state;

/**
 * One of the three states, used to represent when no console is selected, or the home screen. Methods switch between
 * states and print messages.
 * @author zacharystthomas
 *
 */
public class HomeState implements State{
	
	private GameConsole gameConsole;
	/**
	 * Constructor.
	 * @param gameConsole: Instance of gameConsole to set this class's GameConsole as.
	 */
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
/**
 * Prints a message informing user they are already at the home screen.
 */
	public void pressHomeButton() {
		
		System.out.println("You are already at the home screen.");
		
	}

	/**
	 * Informs the user this state does not have any games to list.
	 */
	public void pressGameButton() {
		
		System.out.println("You have to pick a gaming system to play");
	}

/**
 * Switches the gameConsole's state variable to the instance of the XboxState used by gameConsole.
 */
	public void pressXboxButton() {
	
		System.out.println("Starting Xbox....");
		gameConsole.setState(gameConsole.getxBoxState());
	}
	/**
	 * Switches the gameConsole's state variable to the instance of the NintendoState used by gameConsole.
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintedo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}

}
