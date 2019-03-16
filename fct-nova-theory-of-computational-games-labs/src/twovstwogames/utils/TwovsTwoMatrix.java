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
 * Class responsible for the Two versus Two Matrix (in a 2x2 Game).
 */
public class TwovsTwoMatrix {
	
	// Constants/Invariants:
	
	/**
	 * The number of Players (in a 2x2 Game).
	 */
	@SuppressWarnings("unused")
	private static final int NUM_PLAYERS = 2;
	
	/**
	 * The number of Lines (in a 2x2 Game).
	 */
	private static final int NUM_LINES = 2;
	
	/**
	 * The number of Columns (in a 2x2 Game).
	 */
	private static final int NUM_COLUMNS = 2;
	
	
	// Global Instance Variables:
	
	/**
	 * The Matrix structure to keep all the Payoff Cells.
	 */
	private PayoffCell[][] payoffCells;
	
	
	// Constructors:
	
	/**
	 * 
	 * 
	 * @param payoffCell1 the Payoff Cell no. 1, accordingly with the position (1,1) of the Matrix (in a 2x2 Game)
	 * @param payoffCell2 the Payoff Cell no. 2, accordingly with the position (1,2) of the Matrix (in a 2x2 Game)
	 * @param payoffCell3 the Payoff Cell no. 3, accordingly with the position (2,1) of the Matrix (in a 2x2 Game)
	 * @param payoffCell4 the Payoff Cell no. 4, accordingly with the position (2,2) of the Matrix (in a 2x2 Game)
	 */
	public TwovsTwoMatrix(PayoffCell payoffCell1, PayoffCell payoffCell2,
						  PayoffCell payoffCell3, PayoffCell payoffCell4) {

		this.payoffCells = new PayoffCell[NUM_LINES][NUM_COLUMNS];
		
		// Set all the Payoff Cells of this Matrix (in a 2x2 Game)
		this.payoffCells[0][0] = payoffCell1;
		this.payoffCells[0][1] = payoffCell2;
		this.payoffCells[1][0] = payoffCell3;
		this.payoffCells[1][1] = payoffCell4;
	}
	
	
	// Methods/Functions:
	
	/**
	 * Returns the Payoff Cell no. 1, accordingly with the position (1,1) of the Matrix (in a 2x2 Game).
	 * 
	 * @return the Payoff Cell no. 1, accordingly with the position (1,1) of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell getPayoffCell1() {
		return this.payoffCells[0][0];
	}
	
	/**
	 * Returns the Payoff Cell no. 2, accordingly with the position (1,2) of the Matrix (in a 2x2 Game).
	 * 
	 * @return the Payoff Cell no. 2, accordingly with the position (1,2) of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell getPayoffCell2() {
		return this.payoffCells[0][1];
	}
	
	/**
	 * Returns the Payoff Cell no. 3, accordingly with the position (2,1) of the Matrix (in a 2x2 Game).
	 * 
	 * @return the Payoff Cell no. 3, accordingly with the position (2,1) of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell getPayoffCell3() {
		return this.payoffCells[1][1];
	}
	
	/**
	 * Returns the Payoff Cell no. 4, accordingly with the position (2,2) of the Matrix (in a 2x2 Game).
	 * 
	 * @return the Payoff Cell no. 4, accordingly with the position (2,2) of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell getPayoffCell4() {
		return this.payoffCells[1][2];
	}
	
	/**
	 * Returns all the Payoff Cells presented in the first line (positions (1,1) and (1,2))
	 * of the Matrix (in a 2x2 Game).
	 * 
	 * @return all the Payoff Cells presented in the first line (positions (1,1) and (1,2))
	 * 		   of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell[] getFirstLineOfPayoffs() {
		return new PayoffCell[]{this.getPayoffCell1(), this.getPayoffCell2()};
	}
	
	/**
	 * Returns all the Payoff Cells presented in the second line (positions (2,1) and (2,2))
	 * of the Matrix (in a 2x2 Game).
	 * 
	 * @return all the Payoff Cells presented in the second line (positions (2,1) and (2,2))
	 * 		   of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell[] getSecondLineOfPayoffs() {
		return new PayoffCell[]{this.getPayoffCell3(), this.getPayoffCell4()};
	}
	
	/**
	 * Returns all the Payoff Cells presented in the first column (positions (1,1) and (2,1))
	 * of the Matrix (in a 2x2 Game).
	 * 
	 * @return all the Payoff Cells presented in the first column (positions (1,1) and (2,1))
	 * 		   of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell[] getFirstColumnOfPayoffs() {
		return new PayoffCell[]{this.getPayoffCell1(), this.getPayoffCell3()};
	}
	
	/**
	 * Returns all the Payoff Cells presented in the second column (positions (1,2) and (2,2))
	 * of the Matrix (in a 2x2 Game).
	 * 
	 * @return all the Payoff Cells presented in the second column (positions (1,2) and (2,2))
	 * 		   of the Matrix (in a 2x2 Game)
	 */
	public PayoffCell[] getSecondColumnOfPayoffs() {
		return new PayoffCell[]{this.getPayoffCell2(), this.getPayoffCell4()};
	}
	
	/**
	 * TODO
	 * 
	 * @param payoffCellToVerify
	 * 
	 * @return
	 */
	public boolean isNashEquilibrium(PayoffCell payoffCellToVerify) {
		Point matrixCellIndexes = payoffCellToVerify.getPayoffCellIndexes();
		
		// Player no. 1 turn
		switch(matrixCellIndexes.x) {
		
			// First Available Play for the Player no. 1	
			case 0:
				// Froze the first line of the Matrix
				PayoffCell[] firstLineOfPayoffs = this.getFirstLineOfPayoffs();
				
				// Check the Available Plays for the Player no. 2,
				// accordingly to the previously play of the Player no. 1
				switch(matrixCellIndexes.y) {
					case 0:
						if(firstLineOfPayoffs[0].getOutcomeValue2() < firstLineOfPayoffs[1].getOutcomeValue2())
							return false;
						
						break;
					case 1:
						if(firstLineOfPayoffs[0].getOutcomeValue2() > firstLineOfPayoffs[1].getOutcomeValue2())
							return false;
						
						break;
					default:
						break;
				}
				
				break;
			
			// Second Available Play for the Player no. 1	
			case 1:
				// Froze the second line of the Matrix
				PayoffCell[] secondLineOfPayoffs = this.getSecondLineOfPayoffs();
				
				// Check the Available Plays for the Player no. 2,
				// accordingly to the previously play of the Player no. 1
				switch(matrixCellIndexes.y) {
					case 0:
						if(secondLineOfPayoffs[0].getOutcomeValue2() < secondLineOfPayoffs[1].getOutcomeValue2())
							return false;
						
						break;
					case 1:
						if(secondLineOfPayoffs[0].getOutcomeValue2() > secondLineOfPayoffs[1].getOutcomeValue2())
							return false;
						
						break;
					default:
						break;
				}
				
				break;
			default:
				break;
		}
		
		// Player no. 2 turn
		switch(matrixCellIndexes.y) {
			
			// First Available Play for the Player no. 2	
			case 0:
				// Froze the first column of the Matrix
				PayoffCell[] firstColumnOfPayoffs = this.getFirstColumnOfPayoffs();
				
				// Check the Available Plays for the Player no. 1,
				// accordingly to the previously play of the Player no. 2
				switch(matrixCellIndexes.x) {
					case 0:
						if(firstColumnOfPayoffs[0].getOutcomeValue1() < firstColumnOfPayoffs[1].getOutcomeValue1())
							return false;
						
						break;
					case 1:
						if(firstColumnOfPayoffs[0].getOutcomeValue1() > firstColumnOfPayoffs[1].getOutcomeValue1())
							return false;
						
						break;
					default:
						break;
				}
				
				break;
			
			// Second Available Play for the Player no. 2	
			case 1:
				// Froze the second column of the Matrix
				PayoffCell[] secondColumnOfPayoffs = this.getSecondLineOfPayoffs();
				
				// Check the Available Plays for the Player no. 1,
				// accordingly to the previously play of the Player no. 2
				switch(matrixCellIndexes.x) {
					case 0:
						if(secondColumnOfPayoffs[0].getOutcomeValue1() < secondColumnOfPayoffs[1].getOutcomeValue1())
							return false;
						
						break;
					case 1:
						if(secondColumnOfPayoffs[0].getOutcomeValue1() > secondColumnOfPayoffs[1].getOutcomeValue1())
							return false;
						
						break;
					default:
						break;
				}
				
				break;
			default:
				break;
		}
		
		return true;
	}
	
	/**
	 * Returns the number of Equilibrium Nash of this Matrix (in a 2x2 Game).
	 * 
	 * @return the number of Equilibrium Nash of this Matrix (in a 2x2 Game)
	 */
	public int getNumEquilibriumNash() {
		int numEquilibriumNash = 0;
		
		// Test if the Payoff Cell #1 (in position (1,1)) it's on Nash Equilibrium or not
		if(this.isNashEquilibrium(this.getPayoffCell1()))
			numEquilibriumNash++;
		
		// Test if the Payoff Cell #2 (in position (1,2)) it's on Nash Equilibrium or not
		if(this.isNashEquilibrium(this.getPayoffCell2()))
			numEquilibriumNash++;
		
		// Test if the Payoff Cell #3 (in position (2,1)) it's on Nash Equilibrium or not
		if(this.isNashEquilibrium(this.getPayoffCell3()))
			numEquilibriumNash++;
		
		// Test if the Payoff Cell #4 (in position (2,2)) it's on Nash Equilibrium or not
		if(this.isNashEquilibrium(this.getPayoffCell4()))
			numEquilibriumNash++;
				
		return numEquilibriumNash;		
	}
}