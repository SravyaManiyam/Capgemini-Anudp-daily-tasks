class Ex
{
	void display()
	{
		try
		{
			//int a=5/0;
			int a[]=int a[8];
			a[10]=4;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}
}
class AExe 
{
	public static void main(String args[])
	{
		Ex s=new Ex();
		s.display();
	}
}
