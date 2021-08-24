
public class ExpDemo
{
	void display()
	{
		try
		{
			System.out.println("try");
			int a=10/0;
		}
		catch(NullPointerException e)
		{
			System.out.println("catch");

		}
		finally
		{
			System.out.println("finaaly");

		}
		
	}
	public static void main(String args[])
	{
		ExpDemo obj=new ExpDemo();
		obj.display();
	}
	

}