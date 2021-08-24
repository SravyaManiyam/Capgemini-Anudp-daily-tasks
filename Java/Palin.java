import java.util.*;
class Palin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String org=sc.Next();
		StringBuffer str=new StringBuffer(org);
		rev=str.reverse();
		if(org.equals(rev))
		System.out.println("It is a palindrone");
		else
		System.out.println("It is not a palindrone");
	}
}
