class Parent
{
	int c=1234;
	void display()
	{
		System.out.println("parent cls");
	}
}
class ChildOne extends Parent 
{
	int b=5678;
	void display()
	{
			System.out.println("child-1 cls");
			super.display();// to call immediate parent cls method // super keyword use only in child cls
	}
}
class ChildTwo extends Parent
{
	int a =9012;
	void show()
	{
			System.out.println("child-2 cls");
	}
}
class ChildThree extends Parent
{
	int d=234567;
	void show()
	{
			System.out.println("child-3 cls");
	}
}
class HInherit
{
	public static void main(String args[])
	{
		ChildOne c1=new ChildOne();
		System.out.println(c1.c);
		System.out.println(c1.b);
		c1.display();
		ChildTwo c2=new ChildTwo();
		System.out.println(c2.a);
		c2.show();
		ChildThree c3=new ChildThree();
		System.out.println(c3.d);
		c3.show();
	}
}

		



		

		

		

	
		
	
	