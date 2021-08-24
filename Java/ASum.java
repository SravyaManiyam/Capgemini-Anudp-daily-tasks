import java.util.*;
class ASum
{
	public static void main(String args[])
	{
		int array[]={12,34,67,75,39,91};
		int sum=0;
		float avg;
		for(int i=0;i<array.length;i++)
			sum=+array[i];
		int n=array.length;
		avg=sum/n;
		System.out.println("Sum of array elements:"+sum);
		System.out.println("Average of array elements"+avg);
	}

}