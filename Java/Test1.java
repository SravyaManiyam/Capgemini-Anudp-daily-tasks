class Test1
{
public static void main(String args[])
{
Test p =new Test();
p.start();
}
void start()
{
	booleam b1= false;
	boolean b2= fix(b1);
	System.out.println(b1+" "+b2);
}
boolean fix( boolean b1)
{
	b1=true;
	return b1;
}
}
