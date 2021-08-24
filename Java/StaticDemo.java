class StaticDemo
{
	static int a=12;
	static void display()
	{
		System.out.println("Ststic method");
	}
	static
	{
		System.out.println("Ststic block");
	}
	//public static void main(String args[])
	{
		System.out.println(a);
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