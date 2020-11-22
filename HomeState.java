package csce247.state;


public class HomeState implements State{
	
	private GameConsole gameConsole;
	
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}

	public void pressHomeButton() {
		// TODO Auto-generated method stub
		System.out.println("You are already at the home screen.");
		
	}

	
	public void pressGameButton() {
		// TODO Auto-generated method stub
		System.out.println("You have to pick a gaming system to play");
	}


	public void pressXboxButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting Xbox....");
		gameConsole.setState(gameConsole.getxBoxState());
	}

	
	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		System.out.println("Starting Nintedo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}

}
