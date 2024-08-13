import java.util.Random;
import java.util.Scanner;
public class Numbergame
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
Random random = new Random();
int minrange = 1;
int maxrange = 100;
int maxattempts = 5;
int totrounds = 3;
int score = 0;
for (int round = 1; round <= totrounds; round++) 
{
System.out.println("\nRound " + round);
int randNum = random.nextInt(maxrange - minrange + 1) + minrange;
for (int attempt = 1; attempt <= maxattempts; attempt++) 
{
System.out.println("Enter your guess (between " + minrange + " and " + maxrange + "): ");
int userGuess = scanner.nextInt();
if (userGuess == randNum) 
{
System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
score += maxattempts - attempt + 1;
break;
} 
else if (userGuess < randNum) 
{
System.out.println("Too low! Try again.");
} 
else 
{
System.out.println("Too high! Try again.");
}
if (attempt == maxattempts) 
{
System.out.println("Sorry, you ran out of attempts. The number was " + randNum);
}
}
}
System.out.println("\nYour final score is: " + score);
scanner.close();
}
}