abstract class A
{
	abstract void display();// declaration
}
class B extends A//concerte cls
{
	void display()//definition
	{
		System.out.println("class A");
	}
	void show()
	{
		System.out.println("class B");
	}
}
class AbsCls
{
	public static void main(String args[])
	{
		B obj=new B();// create obj for concetre cls only
		obj.display();
		obj.show();
	}
}

		
