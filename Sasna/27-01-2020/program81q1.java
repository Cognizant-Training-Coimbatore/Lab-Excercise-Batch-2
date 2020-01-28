import java.util.Scanner;

public class program81q1 {
	static void validate(int val) throws myexceptions {

	if(val<0) {
		throw new myexceptions("not valid");
	}else {
		System.out.println("valid value");
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter a positive value:");
			int b= sc.nextInt();
			validate(b);
		}
		catch(Exception m) {
			System.out.println("exception occured:" +m);
		}
	}

}