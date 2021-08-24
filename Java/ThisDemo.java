class ThisDemo// to access instant var of current object
{
	int a=20;// instance var
	void display()
	{
		int a=10;//local var
		System.out.println(a);
		System.out.println(this.a);// to access instance variable- this keyword 

	}
	public static void main(String args[])
	{
		ThisDemo obj=new ThisDemo();
		obj.display();
	}
}