import java.util.Scanner;

class Student2{
	String name;
	
	
	
	Student2(){
		name = "unknown";
		System.out.println(name);
		
	}
	Student2(String xyz ) {
		name = xyz;
		System.out.println("the name is : " +name);	
	}
}
public class program34_q5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip_name;
		Student2 obj = new Student2();
		
		System.out.println("enter the name");
		   Scanner sc = new Scanner(System.in);
		   ip_name = sc.nextLine();
		   Student2 obj2 = new Student2(ip_name);
		
	}

}
