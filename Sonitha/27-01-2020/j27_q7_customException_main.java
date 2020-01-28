import java.util.Scanner;

public class j27_q7_customException_main {

	static void valid(int empid) throws j27_q7_customException{
	if(empid>101  & empid<200) {
		throw new j27_q7_customException("Invalid input");
	}else
			{System.out.println("Valid Input");}
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int emp = sc.nextInt();
		try {
	        valid(emp);
		}catch (Exception e) {
			System.out.println("Exception occurred : "+ e);
		}

	}

}
