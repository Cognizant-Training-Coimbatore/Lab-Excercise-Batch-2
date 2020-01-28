class student1 
{
	String name;
	int roll_no;
	String address;
	String phone;
	
	student1()
	{
		name="john";
		roll_no=2;
		address = "kerala";
		phone="9876543076";
		
	}
	
	student1(String n, int r, String a,String p)
	{
		name=n;
		roll_no=r;
	    address = a;
	    phone=p;
	}
	
	void display() {
		System.out.println("name :"+name);
		System.out.println("roll no: " +roll_no);
		System.out.println("address : " +address);
		System.out.println("phone number: " +phone);
	}
	
}



public class exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student1 s = new student1();	
		student1 j = new student1("sam",5,"chennai","7865348297");
		
		s.display();
		j.display();

	}

}
