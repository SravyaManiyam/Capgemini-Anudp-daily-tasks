package pack;
public class Fact
{
	public void Fact( int n)
	{ 
	int f=1;
	for(int i=1;i<=n;i++)
	{
		f*=i;
	}
	System.out.println("Fact of "+n+"is"+f);
	}	
}
