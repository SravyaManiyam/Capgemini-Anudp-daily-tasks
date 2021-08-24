import java.util.*;
class ArrSc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row size:");
		int r=sc.nextInt();
		System.out.println("Enter coloumn size:");
		int c=sc.nextInt();
		int array[][]=new int[r][c];
		System.out.println("Enter array elements:");
		for( int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				array[i][j]=sc.nextInt();
		}
		System.out.println("Array op is ");
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
		System.out.print(array[i][j]+" ");
		System.out.println();

}
	}
}
