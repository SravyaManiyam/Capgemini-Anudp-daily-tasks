import java.io.*;
import java.lang.*;
class AddFile
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter str");
		String str=br.readLine();
		System.out.println("Enter a value:");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter b value");
		int b=Integer.parseInt(br.readLine());
		System.out.println("Enter float c value:");
		Float c=Float.parseFloat(br.readLine());
		System.out.println("Enter float d value");
		Float d=Float.parseFloat(br.readLine());
		Float sum=c+d;
		System.out.println("Sum="+sum);


	}
}




