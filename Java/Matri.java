import java.util.*;
class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
	super(msg);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	{
	super(msg);
	}
}
class Matri
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>50)
		{
			throw new TooOldException("Your are too old, you cannot get marriage");
		}
		else if(age<18)
		{
			throw new TooYoungException("Your are too young, wait for some more time for marriage");
		}
		else
			System.out.println("Thanks for registration... We will mail you the details");
	}
}