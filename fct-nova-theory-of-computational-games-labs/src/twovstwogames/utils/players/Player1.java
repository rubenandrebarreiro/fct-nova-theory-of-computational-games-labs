package twovstwogames.utils.players;

import twovstwogames.utils.AvailablePlays;

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
 * Class responsible for the Player no. 1.
 */
public class Player1 {
	
	// Constants/Invariants:
	
	/**
	 * The index of the cells always related to the play turns of this Player
	 * (normally played for the player no. 1, which plays accordingly with the lines of a 2x2 Game Matrix)
	 */
	public static final int NUM_INDEX_OUTCOME = 0;
	
	
	// Global Instance Variables:
	
	/**
	 * 
	 */
	private AvailablePlays availablePlays;
	
	
	// Constructors:
	
	/**
	 * 
	 * 
	 * @param availablePlays
	 */
	public Player1(AvailablePlays availablePlays) {
		this.availablePlays = availablePlays;
	}
}
