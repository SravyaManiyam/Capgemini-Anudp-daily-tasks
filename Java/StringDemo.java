class StringDemo
{
public static void main(String args[])
{
	//String str= new String("  Hello  ");// string Intialization//
	String str=" Java ";
	System.out.println(str);
	System.out.println(str.length());
	System.out.println(str.indexOf("J"));
	System.out.println(str.charAt(3));
	String str2=str.toUpperCase();
	System.out.println(str2);
	String str3=str.toLowerCase();
	System.out.println(str3);
	System.out.println(str.compareTo("Java"));
	System.out.println(str.trim());
	String str4="Program";
	System.out.println(str+str4);

}
}
