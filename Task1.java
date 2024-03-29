package data.stracture;
import java.util.Random;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {

		 int ans, guess;
		  
         // maximum value is 100
       final int MAXIMUM = 100;
 
       Scanner in = new Scanner(System.in);
 
       Random rand = new Random();
 
       boolean correct = false;
 
       ans = rand.nextInt(MAXIMUM) + 1;
 
       while (!correct) {
 
           System.out.println("Guess a number between 1 and 100: ");
 
           guess = in.nextInt();
 
           if (guess > ans) {
               System.out.println("Too high, try again");
           }
 
           else if (guess < ans) {
               System.out.println("Too low, try again");
           }
 
           else {
 
               System.out.println("Yes, you guessed the number.");
 
               correct = true;
           }
       }
       System.exit(0);
	}

}
