class parent
{
	int a=10;
	void display()
	{
		System.out.println(" parent class");
	}
}
class Child extends parent
{
	int b=20;
	void cdisplay()
	{
		System.out.println(" child class");
	}
}
class SubChild extends Child
{
	int c=30;
	void show()
	{
		System.out.println(" sub-child class");
	}
}
class MInherit
{
	public static void main(String args[])
	{
	SubChild sc=new SubChild();
	System.out.println("parent cls var:"+sc.a);
	System.out.println("child cls var:"+sc.b);
	System.out.println("Sub-child cls var:"+sc.c);
	sc.display();
	sc.cdisplay();
	sc.show();
	}
}

	

	

	
