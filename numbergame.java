import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		int guesses=10;
		int lives=10;
		boolean gameover=false;
		int number=(int) (Math.random()*1000)+1;
		do {
			System.out.println("I am thinking of a number between 1 and 1000. You have "+guesses+" guesse(s) left. What is my number?");
			int userguess=input.nextInt();
			lives-=1;
			guesses-=1;
			if (userguess!=number) {
				
				if (userguess>number) {
					System.out.println("Your guess of "+userguess+" is too high");
				}
				else {
					System.out.println("Your guess of "+userguess+" is too low");
				}
			}
			else {
				System.out.println("You guessed correctly");
				gameover=true;
			}
			
		} while (gameover==false && lives>0);
		if (gameover) {
			System.out.println("You won the game. My number is "+number+ " GG");
		}
		else if (gameover==false) {
			System.out.println("You lost because you ran out of guesses. My number was "+number);
		}
		
	}

}
