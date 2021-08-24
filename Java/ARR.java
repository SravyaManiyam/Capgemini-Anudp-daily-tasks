import java.util.*;
class Arr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter array size:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println(" Enter array elements:");
		for( int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
		System.out.println("Array op="+array[i]);
		}
		
	}
}
