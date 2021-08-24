import java.lang.*;
class StrDemo
{
public static void main(String args[])
{	
	String str=new String(" Hello");
	System.out.println(str);
	System.out.println(str.length());
	System.out.println(str.indexOf("e"));
		System.out.println(str.charAt(2));;
		System.out.println(str.replace(" Hello","HELLO"));
	System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.compareTo("Hello"));
		

}

}