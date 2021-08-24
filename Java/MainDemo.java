class StaticDemo
{
	static int a=12;
	static void display()
	{
		System.out.println("Static method");
	}
	static
	{
		System.out.println("Static block");
	}
	//public static void main(String args[])
	{
		System.out.println(a);// single cls direct access Var & methods //
		display();
}}
class MainDemo
{
	public static void main(String args[])
	{
		System.out.println(StaticDemo.a);//2 classes are there so access var & methods with help of Classname//
		StaticDemo.display();
	}
}