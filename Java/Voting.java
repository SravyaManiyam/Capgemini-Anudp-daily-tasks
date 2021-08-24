import java.util.*;
class UnderAgeException extends RuntimeException
{
	UnderAgeException() //default const //
	{
		super("You are under age");
	}
	UnderAgeException(String msg)// para const//
	{
		super("msg");
	}
}
public class Voting
{
	public static void main(String args[])
	{
			int age=17;
			if(age<18)
			{
			throw new UnderAgeException("u cant vote");	
			}
	System.out.println("Hi");	
		
		
	}
}
