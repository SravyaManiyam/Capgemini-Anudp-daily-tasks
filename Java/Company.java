class Employee
{
int EmpId;
static double Sal=0;
double Basic;
double Allowance;
double Deductions;
String FirstName;
String lastName;
String Address;
String Pincode;
private String RealName="FirstName"+"lastname";
	public void setRealName(String name)
	{
	RealName=name;
	}
	public String getRealName()
	{
		return RealName;
	}
	
}
class Company
{
	public static void main(String args[])
	{
	Employee e=new Employee();
	e.setRealName("Sravya");
	System.out.print("Enployee name is"+e.getRealName());
	}
}
