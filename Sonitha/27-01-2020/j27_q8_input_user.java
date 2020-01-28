import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class j27_q8_input_user {
	
static void display(String n1 , String a1, long a11,int bool) throws FileNotFoundException {
	if(bool ==1 || bool == 0) {
		if(bool==1)
		 {System.out.println("Record saved ....exiting....");
		FileOutputStream fout = new FileOutputStream("E:\\Employee.txt");
		PrintStream p = new PrintStream(fout);
		p.println("Name : " + n1);
		p.println("Address : " + a1);
		p.println("Aadhar Number : " + a11);
		p.close();
		 }else  {
				
				System.out.println("Record not saved and ...exiting...");
			}
	}
	else
	{
		throw new ArithmeticException("Invalid Choice ");
	}
	
}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your address : ");
		String address = sc.next();
		System.out.println("Enter your aadharcard number : ");
		long aadhar = sc.nextLong();
		System.out.println("Do you want to save ? ");
		int  b = sc.nextInt();
		
			display(name, address, aadhar, b);
		
	}

}
