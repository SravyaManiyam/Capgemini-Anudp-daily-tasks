//class Single extends Thread
class Single implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				try	
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}

				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println(" Method in Tread cls");
	}
}
class ST
{
	public static void main(String args[])
	{
		Single s=new Single();
		Thread t=new Thread(s);
		System.out.println("Thraed ID is"+t.getId());
		System.out.println("Thread Name is"+t.getName());
		t.setName("SRAVYA");
		System.out.println("Thread Name is"+t.getName());
		System.out.println("priority of thread is"+t.getPriority());
		t.setPriority(6);
		System.out.println("priority of thread is"+t.getPriority());
		System.out.println("Thread status;"+t.isAlive());
		t.start();
		/*Single s=new Single();
		s.Start();*/
	}
}
