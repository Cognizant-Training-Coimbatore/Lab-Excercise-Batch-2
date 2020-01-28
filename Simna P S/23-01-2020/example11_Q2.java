import java.util.Scanner;

class student1
{
	int roll_no, phoneNumber;
	String address;
	String name;
	
	void assign()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of the student: ");
    	name = input.next();
    	System.out.println("Enter the roll number: ");
    	roll_no = input.nextInt();
    	System.out.println("Enter the Phone no: ");
    	phoneNumber= input.nextInt();
    	System.out.println("Enter the address: ");
    	address = input.next();
    	
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+roll_no);
		System.out.println("phone no: "+phoneNumber);
		System.out.println("Address: "+address);
	}
}
public class example11_Q2 
{

	public static void main(String[] args) 
	{
		student1 obj = new student1();
		
		
		obj.assign();
		obj.display();
	}

}
