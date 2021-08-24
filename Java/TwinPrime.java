
public class TwinPrime {
	public static void main(String args[])
	{
		for(int i=2;1<100;i++)
		{
			if(is_prime(i)&& is_prime(i+2))
			                      System.out.println("(%d,%d)/n",i,i+2);
		}
	}
			
}
public static boolean is_prime(long n)
{
	if(n<2) return false;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0) return false;
		return true;
	}
		
}