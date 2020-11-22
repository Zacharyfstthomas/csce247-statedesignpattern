package csce247.state;
public class GameConsole {
	
	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	
	
	public GameConsole() {
		
		this.HomeState = new HomeState(this);
		this.NintendoState = new NintendoState(this);
		this.xBoxState = new XboxState(this);
		this.state = new HomeState(this);
		System.out.println("Starting up the Game Console");
	}

	public void pressGameButton() {
		// TODO Auto-generated method stub
		state.pressGameButton();
	}

	public void pressNintendoButton() {
		// TODO Auto-generated method stub
		state.pressNintendoButton();
	}

	public void pressXBoxButton() {
		// TODO Auto-generated method stub
		state.pressXboxButton();
	}

	public void pressHomeButton() {
		// TODO Auto-generated method stub
			state.pressHomeButton();
	}

	public void setState(State state){
		
		 this.state = state;
		
	}
		

	public State getHomeState() {
		return HomeState;
	}

	public State getNintendoState() {
		return NintendoState;
	}

	public State getxBoxState() {
		return xBoxState;
	}
	
	
	
	
}
