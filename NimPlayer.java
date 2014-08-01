/* NimPlayer.java
 * The class NimPlayer is used for creating objects for Players. It contains 
 * basic details of each player and has accessor and mutator methods for 
 * accessing the instance variables.
 * Author: Natasha A. Thomas
 * Student ID: 669907
 * Username: natashat1
 * Created on 30/04/2014
 */

public class NimPlayer
{
	private String givenName, familyName, userName;
	private int numGamesPlayed, numGamesWon;

	// Default constructor for class NimPlayer
	public NimPlayer()
	{
	}

	// Parameterized constructor for class NimPlayer
	public NimPlayer(String uname, String lname, String fname)
	{
		userName = uname;
		familyName = lname;
		givenName = fname;
		numGamesPlayed = 0;
		numGamesWon = 0;
	}

	// Displays details of players
	public void displayDetails()
	{
		System.out.println(userName + "," + givenName + "," + familyName 
				+ "," + numGamesPlayed + " games," + numGamesWon + " wins");
	}

	// Mutator
	public void setGivenName(String name)
	{
		givenName = name;
	}

	// Mutator
	public void setFamilyName(String name)
	{
		familyName = name;
	}
	
	// Accessor
	public String getGivenName()
	{
		return givenName;
	}

	// Accessor
	public String getFamilyName()
	{
		return familyName;
	}
	
	// Accessor
	public String getUserName()
	{
		return userName;
	}
	
	// Mutator
	public void setUserName(String name)
	{
		userName = name;
	}

	// Resets statistics of players
	public void resetStats()
	{
		numGamesPlayed = 0;
		numGamesWon = 0;
	}
	
	// Accessor
	public int getNumGamesPlayed()
	{
		return numGamesPlayed;
	}
	
	// Accessor
	public int getNumGamesWon()
	{
		return numGamesWon;
	}
	
	// Mutator
	public void setNumGamesPlayed(int num)
	{
		numGamesPlayed = num;
	}
	
	// Mutator
	public void setNumGamesWon(int num)
	{
		numGamesWon = num;
	}
	
	// Increments number of games played by each player
	public void updateNumGamesPlayed()
	{
		numGamesPlayed++;
	}
	
	// Increments number of games won by each player
	public void updateNumGamesWon()
	{
		numGamesWon++;
	}
}