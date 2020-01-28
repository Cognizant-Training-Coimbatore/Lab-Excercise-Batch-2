class Student1{
	String name;
	int roll_no;
	String phone_number;
	String Address;
	Student1()
	{
		name="John";
		roll_no=2;
		phone_number="1234567890";
		Address="ABC";
		System.out.println("NAme\t:\t"+name);
		System.out.println("Phone Number\t:\t"+phone_number);
		System.out.println("Roll No\t:\t"+roll_no);
		System.out.println("Address\t:\t"+Address);
	}
	Student1(int roll,String phn,String add)
	{
		name="Sam";
		roll_no=roll;
		phone_number=phn;
		Address=add;
		System.out.println("NAme\t:\t"+name);
		System.out.println("Phone Number\t:\t"+phone_number);
		System.out.println("Roll No\t:\t"+roll_no);
		System.out.println("Address\t:\t"+Address);
	}
	/*
	void display()
	{
		System.out.println("NAme\t:\t"+name);
		System.out.println("Phone Number\t:\t"+phone_number);
		System.out.println("Roll No\t:\t"+roll_no);
		System.out.println("Address\t:\t"+Address);
	}*/
}

public class qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 obj= new Student1();
		Student1 obj1=new Student1(12, "0987654321", "MNB");
	}

}
