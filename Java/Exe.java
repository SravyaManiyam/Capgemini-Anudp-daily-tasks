class Ex
{
	void display()
	{
		try
		{
			//int a=5/0;
			
			/*int a[]=new int [6];
			a[10]=4;*/
			
			/*String str= null;
			System.out.println(str.length());*/
			
			String str="hello";
			int num=Integer.parseInt(str);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}
}
class Exe 
{
	public static void main(String args[])
	{
		Ex s=new Ex();
		s.display();
	}
}
