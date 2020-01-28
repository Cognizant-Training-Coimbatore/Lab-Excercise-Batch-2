class Stdnt
{
	int roll_no;
	String phone_no,name,address;;

}
public class program33_Assign_an_print_rollno {

	public static void main(String[] args) {
	Stdnt obj1=new Stdnt();
	Stdnt obj2=new Stdnt();
	obj1.name="John";
	obj1.roll_no=1;
	obj1.phone_no="9446361640";
	obj1.address="Nest house";
	obj2.name="Sam";
	obj2.roll_no=1;
	obj2.phone_no="9446331640";
	obj2.address="Best house";
	System.out.println("Name: "+obj1.name+"\nRoll_no:"+obj1.roll_no+"\nPh_no: "+obj1.phone_no+"\nAddress: "+obj1.address);
	System.out.println("\nNEXT STUDENT\n");
	System.out.println("Name: "+obj2.name+"\nRoll_no:"+obj2.roll_no+"\nPh_no: "+obj2.phone_no+"\nAddress: "+obj2.address);
	}

}
