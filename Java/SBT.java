import java.lang.*;
class SBT
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("HI");
		System.out.println(str);
		System.out.println(str.length());
				System.out.println(str.append("JAVA"));
				System.out.println(str.indexOf("J"));
				System.out.println(str.charAt(4));
						System.out.println(str.insert(2,"Welcomre"));
		System.out.println(str.delete(2,11));
				System.out.println(str.replace(4,8,"Java"));	
				System.out.println(str.replace(4,8,"Java"));	
				System.out.println(str.subSequence(3,8));
						System.out.println(str.substring(3));
						System.out.println(str.reverse());
	}
	
}
				

