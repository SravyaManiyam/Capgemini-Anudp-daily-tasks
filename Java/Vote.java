import java.util.*;
class Vote
{
	public static void main(String args[]) throws UnderAgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18)
		{
			throw new UnderAgeException("Not eligible to vote... Age should be above 18 years");
			
		}
		else
		System.out.println("Thanks for voting...");
	}
}
class UnderAgeException extends Exception
{
	UnderAgeException(String msg)
	{
	super(msg);
	}
	
}
