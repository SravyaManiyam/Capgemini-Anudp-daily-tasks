class StringBufferDemo
{
public static void main(String args[])
{
	//String str="Welcome";
	StringBuffer str=new StringBuffer("Welcome");//accesssing methods in StringBuffer class, obj is to be created
	System.out.println("Welcome");
	System.out.println(str.append("JAVA"));
	System.out.println(str.insert(7,"to"));
	System.out.println(str.delete(7,9));
	System.out.println(str.reverse());
	System.out.println(str.reverse());
	System.out.println(str.replace(7,11,"SRAVYA"));
	System.out.println(str.length());
	System.out.println(str.substring(7));
	System.out.println(str.indexOf("SRAVYA"));
	System.out.println(str.charAt(8));
	System.out.println(str.append("to java"));
	System.out.println(str.subSequence(13,20));
	System.out.println(str);
	
	
	
}
}
