import java.util.*;
class Desktop//parent class
{
	System.out.println("version");
	Scanner sc=new Scanner(System.in);
	int version=sc.nextInt();
	String Company="HP";
	void display()
	{
		System.out.println("Desktop-Parent class");
	}
}
class Laptop extends Desktop//child cls 
{
	//System.out.println("Processor");
	Scanner sc=new Scanner(System.in);
	int Processor=sc.nextInt();
	int YOP=2021;
	void show()
	{
		System.out.println("Laptop-child class");
	}
}
class SingleInherit
{
	public static void main(String args[])
	{

		Laptop lp=new Laptop();
		System.out.println(lp.version);
		System.out.println(lp.Company);
		lp.display();
		System.out.println(lp.Processor);
		System.out.println(lp.YOP);
		lp.show();
	}
}
