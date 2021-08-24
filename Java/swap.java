//prgm to swap two numbers;
import java.lang.*;
import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x=sc.nextInt();
		System.out.println("Enter the first number:");
		int y=sc.nextInt();
		System.out.println("Before Swapping"+"x="+x+";"+"y="+y);
		/*int temp=x;
		x=y;
		y=temp;*/
		x=x+y;
		y=x-y;
		x=x-y;	
		System.out.println("After Swapping"+"x="+x+";"+"y="+y);
	}
}

