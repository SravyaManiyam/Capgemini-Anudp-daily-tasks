import java.util.*;
class PDemo
{
	public static void main(String args[])
	{
		String original, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num or string:");
		original=sc.nextLine();
		int length=original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original==reverse)
		System.out.println("It is a palindrome");
	else
				System.out.println("It is not a palindrome");
	}
	

	
		
		
}
