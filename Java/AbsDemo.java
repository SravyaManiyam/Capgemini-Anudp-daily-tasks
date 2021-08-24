abstract class A
{
	abstract void display();
	void adisplay()
	{
		System.out.println("cls-A Display method");
	}
}
abstract class B extends A
{
	void display()
	{
		System.out.println("class-A abstarct display method");

	}
	abstract void show();
}
class C extends B//concrete cls
{
	void show()
	{
		System.out.println("cls-B show method");

	}
	void ashow()
	{
		System.out.println("Cls-c show method");

	}
	
}
class AbsDemo
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.show();
		obj.ashow();
		obj.display();
		obj.adisplay();

	}
}
