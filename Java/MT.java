class Multi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
class MT 
{
	public static void main(String args[])
	{
		Multi t=new Multi();
		Multi i=new Multi();
		t.start();
		try
		{
			t.join();
		}
		catch(Exception e)
		{}
		System.out.println("Thread-1 status is:"+t.isAlive());
		i.start();
		System.out.println("Thread-2 status is:"+i.isAlive());

	}
}
