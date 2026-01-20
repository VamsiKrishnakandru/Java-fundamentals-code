import java.util.Scanner;

class Guesser
{
	int number;
	
	int guessingNumber()
	{
		System.out.println("Guesser! kindly guess the number between 1 to 10");
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		return number;
	}
}
class Player
{
	int number;
	
	int guessingNumber()
	{
		System.out.println("Player! kindly guess the number between 1 to 10");
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		return number;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;
	
	void collectNumFromGuesser()
	{
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessingNumber();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromP1=p1.guessingNumber();
		numFromP2=p3.guessingNumber();
		numFromP3=p2.guessingNumber();
		
	}
	void verify()
	{
		if(numFromGuesser==numFromP1)
		{
			System.out.println("Player 1 won the the game");
		}
		else if(numFromGuesser==numFromP2)
		{
			System.out.println("Player 2 won the the game");
		}
		else if(numFromGuesser==numFromP3)
		{
			System.out.println("Player 3 won the the game");
		}
		else
		{
			System.out.println("Game lost! Try again");
		}
	}
}


public class LaunchGame {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Number Guessing Game");
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.verify();
	}

}
