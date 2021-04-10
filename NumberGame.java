import java.util.*;
public class NumberGame
{

	public static void main(String[] args) 
	{
		int attempt =0;
		int userguessNumber;
		int secretNumber =(int) (Math.random()* 99 + 1);
		Scanner user = new Scanner(System.in);
				System.out.println(" Welcome to Guess Number Game \n You will be asked to Guess a Number to win the Game \n You have Maximum 5 Attemp Limit.");
				System.out.println("Enter a Guess the Number between 1 to 100 ");
				while(attempt < 5)
                {
				
				userguessNumber =user.nextInt();
                
				 if(userguessNumber==secretNumber)
				 {
				  System.out.println("OOhhOO!, Your Number is correct. You Win the Game! ");	
				 }
				 else if (userguessNumber < secretNumber)
				 {
					System.out.println("Your Guess Number is Smaller");
				 }
				 else
				 {
					System.out.println("Your Guess Number is Greater");
				 }
				 attempt++;
                }
				System.out.println("Your have exceeded the Maximum Attempt. Try Again ");
				
	}

}