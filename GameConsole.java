package csce247.state;
/**
 * GameConsole class is what is called by the driver to access the state classes using a state variable
 * that can be exchanged for any of the other state variables. This design pattern allows for 
 * very interchangable code that all revolves around a changable State which can be either HomeState, NintendoState
 * or xBoxState. Contains instances of all three states so as to allow the state classes to call the correct instance
 * of another state.
 * @author zacharystthomas
 *
 */

public class GameConsole {
	
	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	
	/**
	 * Constructor.
	 * Passes the current instance of GameConsole to ensure that each of the states can change this class's state
	 * variable to an instance of another state class.
	 */
	public GameConsole() {
		
		this.HomeState = new HomeState(this);
		this.NintendoState = new NintendoState(this);
		this.xBoxState = new XboxState(this);
		this.state = new HomeState(this);
		System.out.println("Starting up the Game Console");
	}
/**
 * Calls the state's pressGameButton method.
 */
	public void pressGameButton() {

		state.pressGameButton();
	}
	/**
	 * Calls the state's pressGameButton method.
	 */
	public void pressNintendoButton() {
	
		state.pressNintendoButton();
	}
	/**
	 * Calls the state's pressGameButton method.
	 */
	public void pressXBoxButton() {

		state.pressXboxButton();
	}
	/**
	 * Calls the state's pressGameButton method.
	 */
	public void pressHomeButton() {
	
			state.pressHomeButton();
	}
	/**
	 * Sets state to a the state passed as the parameter.
	 */
	public void setState(State state){
		
		 this.state = state;
		
	}
		
/**
 * 
 * @return Returns the hHomeState state.
 */
	public State getHomeState() {
		return HomeState;
	}
	/**
	 * 
	 * @return Returns the NintendoState state.
	 */
	public State getNintendoState() {
		return NintendoState;
	}
	/**
	 * 
	 * @return Returns the XboxState state.
	 */
	public State getxBoxState() {
		return xBoxState;
	}
	
	
	
	
}
