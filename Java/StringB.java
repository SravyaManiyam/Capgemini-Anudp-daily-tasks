import java.lang.*;
class StringB
{
	public static void main(String args[])
	{
		StringBuffer str=new StringBuffer("Hi");
		System.out.println(str);
		System.out.println(str.append("Frnds"));
		System.out.println(str.insert(7,"to Java"));
		System.out.println(str.length());
		System.out.println(str.reverse());
		System.out.println(str.reverse());
		System.out.println(str.delete(7,14));
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf("i"));
		System.out.println(str.substring(2));
		System.out.println(str.subSequence(2,7));
		System.out.println(str.replace(2,7,"sravya"));
	}
}
		
		
		