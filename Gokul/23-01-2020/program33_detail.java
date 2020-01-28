package gokul;
class students
{
	void assign(String name, long roll_no,long phone_no,String add)
	{
		String n=name;
		long x=roll_no;
		long y=phone_no;
		String s=add;
		System.out.println("Name : "+ " roll no: "+x+" Phone number = "+phone_no+" Address :"+s);
		
	}
}
public class program33_detail {

	public static void main(String[] args) 
	{
		students obj=new students();
		obj.assign("Sam",12, 959, "Ezhuthachan veetil beypore");	
		obj.assign("John",32, 98575, "Sreedhanya Haven ambalamukku");
	}

}
