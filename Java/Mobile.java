interface Features
{
	void calling();
	void msging();
}
interface Addons
{
	void vcalling();
	void mms();
}
class FeaturedPhone implements Features
{
	public void calling()
	{
		System.out.println("Featured phone is calling");
	}
	public void msging()
	{
		System.out.println("Featured phone is msging");
	}
}
class SmartPhone implements Features,Addons
{
	public void calling()
	{
		System.out.println("smart phone is calling");
	}
	public void msging()
	{
		System.out.println("smart phone is msging");
	}
	public void vcalling()
	{
		System.out.println("smart phone is in vcalling");
	}
	public void mms()
	{
		System.out.println("smart phone is using mms");

	}
}
class Mobile
{
	public static void main(String args[])
	{
		SmartPhone sp=new SmartPhone();
		sp.calling();
		sp.msging();
		sp.vcalling();
		sp.mms();
		FeaturedPhone fp=new FeaturedPhone();
		fp.calling();
		fp.msging();
		
	}
}x