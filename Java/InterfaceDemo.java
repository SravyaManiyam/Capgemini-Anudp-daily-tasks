interface A // parent cls-1 
{
	void Adisplay();
	void Ashow();
	
}
interface B // paret cls-2
{
	void Bdisplay();
	void Bshow();
}
class AB implements A,B// child cls // concrete cls
{
	public void Adisplay()
	{
		System.out.println("Interface-A display method");
	}
	public void Ashow()
	{
		System.out.println("Interface-A show method");

	}
	public void Bdisplay()
	{
		System.out.println("Interface-B display method");

	}
	public void Bshow()
	{
		System.out.println("Interface-B show method");
	}
}
class InterfaceDemo
{
	public static void main(String args[])
	{
		AB obj=new AB();
		obj.Adisplay();
		obj.Ashow();
		obj.Bdisplay();
		obj.Bshow();
	}
}
