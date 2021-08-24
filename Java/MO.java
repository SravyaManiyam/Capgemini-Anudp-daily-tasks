class AddDemo
{
	void add()
	{
		int a=12, b=43,sum;
		sum=a+b;
		System.out.println("add of a & b="+sum);
	}
	void add(int c,int d)
	{
		int s=c+d;
		System.out.println("add of c & d="+s);
	}
}
class MO//method overloading 
{
	public static void main(String args[])
	{
		AddDemo obj=new AddDemo();
		obj.add();
		//AddDemo obj2=new AddDemo();
		obj.add(76,98);
	}
}
		