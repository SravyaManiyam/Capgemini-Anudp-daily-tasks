class ExeDemo
{
	public static void main(String args[])
	{
		void show()
		{
			try
			{
				int a=5/0;
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			System.out.println("Exception handled");
		}
	System.out.println("success");
	}
}

	