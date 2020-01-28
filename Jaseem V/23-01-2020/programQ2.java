class student1
{
	int roll_number;
	int phone_number;
	String Address;
	student1(String Sam)
	{
		roll_number = 1;
		phone_number = 989582923;
		Address = "PK House, RK colony, Trivandrum 676565";
		System.out.println("Roll number ="+roll_number+ "Phone number =" +phone_number);
		System.out.println(Address);
	}
	student1(String John,int a)
	{
		roll_number = 2;
		phone_number = 989582978;
		Address = "shubham House, colony road, Trivandrum 6733565";
		System.out.println("Roll number ="+roll_number+ "Phone number =" +phone_number);
		System.out.println(Address);
	}
	
}
public class programQ2 {

	public static void main(String[] args)
	{
		student1 obj1 =new student1("Sam");
		student1 obj2 =new student1("John",1);
		
	}

}
