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

import java.awt.Point;

/**
 * Class responsible for the Payoff Cell.
 */
public class PayoffCell {
	
	// Constants/Invariants:
	
	/**
	 * The number of indexes of a Payoff Cell in the matrix (in a 2x2 Game),
	 * accordingly with the current game, played for 2 players, in this case.
	 */
	private static final int NUM_INDEXES = 2;
	
	
	// Global Instance Variables:
	
	/**
	 * The indexes of the Payoff Cell of a set of Players' plays in turn (in a 2x2 Game).
	 */
	private Point payoffCellIndexes;
	
	/**
	 * The values of the outcomes of the Payoff Cell of a set of Players' plays in turn (in a 2x2 Game).
	 */
	private int[] payoffCellOutcomes;
	
	
	// Constructors:
	
	/**
	 * Constructor #1:
	 * 
	 * Construct a Payoff Cell for a certain Matrix (in a 2x2 Game).
	 * (initialising their indexes and outcomes, accordingly with the values of
	 * the outcomes resulted of the plays of the 2 Players).
	 * 
	 * @param index1 the index no. 1 of this Payoff Cell
	 * @param index2 the index no. 2 of this Payoff Cell
	 * @param outcome1 the outcome of the index no. 1
	 *        (normally played for the player no. 1, which plays accordingly with the lines of the Matrix)
	 * @param outcome2 the outcome of the index no. 2
	 * 		  (normally played for the player no. 2, which plays accordingly with the columns of the Matrix)
	 */
	public PayoffCell(int index1, int index2, int outcome1, int outcome2) {
		
		this.payoffCellIndexes = new Point(index1, index2);
		
		this.payoffCellOutcomes = new int[NUM_INDEXES];
		
		// Fill the indexes of the Payoff Cell Outcomes with the values of outcomes
		this.payoffCellOutcomes[0] = outcome1;
		this.payoffCellOutcomes[1] = outcome2;
	}
	
	
	// Methods/Functions:
	
	/**
	 * Returns the indexes of the Payoff Cell of the Matrix (in a 2x2 Game).
	 * 
	 * @return the indexes of the Payoff Cell of the Matrix (in a 2x2 Game)
	 */
	public Point getPayoffCellIndexes() {
		return this.payoffCellIndexes;
	}
	
	/**
	 * Returns the index no. 1 of the Payoff Cell of the Matrix (in a 2x2 Game).
	 * 
	 * @return the index no. 1 of the Payoff Cell of the Matrix (in a 2x2 Game)
	 */
	public int getIndex1() {
		return this.payoffCellIndexes.x;
	}
	
	/**
	 * Returns the index no. 2 of the Payoff Cell of the Matrix (in a 2x2 Game).
	 * 
	 * @return the index no. 2 of the Payoff Cell of the Matrix (in a 2x2 Game)
	 */
	public int getIndex2() {
		return this.payoffCellIndexes.y;
	}
	
	/**
	 * Returns all the values of outcomes of the Payoff Cell of the Matrix (in a 2x2 Game).
	 * 
	 * @return all the values of outcomes of the Payoff Cell of the Matrix (in a 2x2 Game)
	 */
	public int[] getPayoffCellOutcomes() {
		return this.payoffCellOutcomes;
	}
	
	/**
	 * Returns the value of the outcome of the index no. 1 (in a 2x2 Game)
	 * (normally played for the player no. 1, which plays accordingly with the lines of the Matrix).
	 * 
	 * @return the value of the outcome of the index no. 1 (in a 2x2 Game)
	 *         (normally played for the player no. 1, which plays accordingly with the lines of the Matrix)
	 */
	public int getOutcomeValue1() {
		return this.payoffCellOutcomes[0];
	}
	
	/**
	 * Returns the value of the outcome of the index no. 2 (in a 2x2 Game)
	 * (normally played for the player no. 2, which plays accordingly with the columns of the Matrix).
	 * 
	 * @return the value of the outcome of the index no. 2 (in a 2x2 Game)
	 *         (normally played for the player no. 2, which plays accordingly with the columns of the Matrix)
	 */
	public int getOutcomeValue2() {
		return this.payoffCellOutcomes[1];
	}
}