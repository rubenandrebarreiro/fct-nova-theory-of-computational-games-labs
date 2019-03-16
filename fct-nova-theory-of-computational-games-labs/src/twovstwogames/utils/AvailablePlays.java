package twovstwogames.utils;

/**
 * 
 * Theory of Computational Games
 * 
 * Practical Labs.
 * 
 * Integrated Master of Computer Science and Engineering
 * Faculty of Science and Technology of New University of Lisbon
 * 
 * Authors (Professors):
 * @author Joao Alexandre Leite - jleite@fct.unl.pt
 * 
 * Adapted by:
 * @author Ruben Andre Barreiro - r.barreiro@campus.fct.unl.pt
 *
 */

/**
 * Class responsible for the Available Plays for a certain Player (in a 2x2 Game).
 */
public class AvailablePlays {
	
	// Constants/Invariants:
	
	/**
	 * The number of indexes of the Available Plays for a certain Player (in a 2x2 Game),
	 * accordingly with the current game, played by 2 Players, in this case.
	 */
	private static final int NUM_AVAILABLE_PLAYS = 2;
	
	
	// Global Instance Variables:
	
	/**
	 * The Available Plays for each play turn of a Player (in a 2x2 Game).
	 */
	private String[] availablePlays;
	
	
	// Constructors:
	
	/**
	 * Constructor #1:
	 * 
	 * Construct the Available Plays for a certain Player (in a 2x2 Game).
	 * 
	 * @param availablePlay1 the first Available Play for a certain Player (in a 2x2 Game)
	 * @param availablePlay2 the second Available Play for a certain Player (in a 2x2 Game)
	 */
	public AvailablePlays(String availablePlay1, String availablePlay2) {
		this.availablePlays = new String[NUM_AVAILABLE_PLAYS];
		
		// Fill the indexes of the Available Plays
		this.availablePlays[0] = availablePlay1;
		this.availablePlays[1] = availablePlay2;
	}
	
	/**
	 * Returns all the Available Plays for a certain Player (in a 2x2 Game).
	 * 
	 * @return all the Available Plays for a certain Player (in a 2x2 Game)
	 */
	public String[] getPlaysAvailable() {
		return this.availablePlays;
	}
	
	/**
	 * Returns the first Available Play for a certain Player (in a 2x2 Game).
	 * 
	 * @return the first Available Play for a certain Player (in a 2x2 Game)
	 */
	public String getFirstAvailablePlay() {
		return this.availablePlays[0];
	}
	
	/**
	 * Returns the second Available Play for a certain Player (in a 2x2 Game).
	 * 
	 * @return the second Available Play for a certain Player (in a 2x2 Game)
	 */
	public String getSecondAvailablePlay() {
		return this.availablePlays[1];
	}
}