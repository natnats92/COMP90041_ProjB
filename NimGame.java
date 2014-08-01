/* NimGame.java
 * The class NimGame implements the Nim game.
 * Author: Natasha A. Thomas
 * Student ID: 669907
 * Username: natashat1
 * Created on 30/04/2014
 */

import java.util.Scanner;

public class NimGame {

	private int initialStones, upperBound;
	private String player1, player2;
	
	// Default constructor
	public NimGame()
	{
		
	}
	
	// Parameterized constructor that initializes the instance variables and 
	// displays game information
	public NimGame(int initStones, int upBound, NimPlayer play1, 
			NimPlayer play2)
	{
		initialStones = initStones;
		upperBound = upBound;
		player1 = play1.getGivenName();
		player2 = play2.getGivenName();
		System.out.println("\nInitial stone count: " + initialStones);
		System.out.println("Maximum stone removal: " + upperBound);
		System.out.println("Player 1: " + player1 + " " 
				+ play1.getFamilyName());
		System.out.println("Player 2: " + player2 + " " 
				+ play2.getFamilyName());
		System.out.println();
	}
	
	// Function that implements the rules of Nim game
	public void playGame(Scanner scanner, NimPlayer play1, NimPlayer play2)
	{
		int counter = 0, removeNumber;
		
		// Increments the number of games played by each player
		play1.updateNumGamesPlayed();
		play2.updateNumGamesPlayed();
		
		// The players remove stones in turns. The loop iterates till the 
		// number of stones becomes 0.
		while (initialStones > 0)
 		{
			// Each player enters number of stones to be removed. The loop 
			// iterates till a valid value for removeNumber is entered.
			do
			{	
				System.out.print(initialStones + " stones left: ");
				
				// Displays stones on the screen
				for (int i = 0; i < initialStones - 1; i++)
				{
					System.out.print("* ");
				}
				System.out.print("*\n");
				
				// The value of counter initially set as 0 helps to determine 
				// which players turn it is.
				if (counter % 2 == 0)
					System.out.print(player1 + "'s turn - ");
				else
					System.out.print(player2 + "'s turn - ");
				
				System.out.print("remove how many?\n");
				removeNumber = scanner.nextInt();

				System.out.println();
				scanner.nextLine();
			
				if (initialStones < upperBound)
					upperBound = initialStones;
				if (removeNumber > upperBound || removeNumber == 0)
				{
					System.out.println("Invalid move. You must remove between "
							+ "1 and " + upperBound + " stones.\n");
				}
			
			} while (removeNumber > upperBound || removeNumber == 0);
			
			initialStones = initialStones - removeNumber;
			
			// The counter is incremented to indicate next players turn.
			counter++;
		}
		
		System.out.println("Game Over");
		
		if(counter % 2 == 0)
		{
			System.out.println(player1 + " " + play1.getFamilyName() 
					+ " wins!");
			play1.updateNumGamesWon();
		}
			
		else
		{
			System.out.println(player2 + " " + play2.getFamilyName() 
					+ " wins!");
			play2.updateNumGamesWon();
		}
	}
}
