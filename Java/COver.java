class AC
{
	A()//constructor
	{
		System.out.println("Constructor");
	}
	A(int a )// const with paramters
	{
	
		System.out.println(a);
	}
}
class COver
{
	public static void main(String args[])
	{
		AC obj=new AC();
		obj.A();
		AC obj2=new AC();
		obj2.A(12);
	}
}