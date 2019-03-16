package twovstwogames.utils.players;

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

import twovstwogames.utils.AvailablePlays;

/**
 * Class responsible for the Player no. 2.
 */
public class Player2 {
	
	// Constants/Invariants:
	
	/**
	 * The index of the cells always related to the play turns of this Player
	 * (normally played for the player no. 2, which plays accordingly with the columns of a 2x2 Game Matrix)
	 */
	public static final int NUM_INDEX_OUTCOME = 1;
	
	
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
	public Player2(AvailablePlays availablePlays) {
		this.availablePlays = availablePlays;
	}
}
