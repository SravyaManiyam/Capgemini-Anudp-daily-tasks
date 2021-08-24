import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no ofrows:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{			
		for(int k=1;k<=n-i+1;k++)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
		System.out.print(j);
		}
		for(int l=2;l<=i;l++)
		{
			System.out.print(l);
		}
		System.out.println();
		}
	}
}
