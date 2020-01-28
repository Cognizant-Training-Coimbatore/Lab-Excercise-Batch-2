import java.util.Scanner;

public class qn5 {
	static void validate(int marks) throws  program37_myexception
	{
		if(marks>0)
		{
			System.out.println("accepted");
		}
		else
		{
			throw new  program37_myexception("Invalid marks entered");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		try {
			validate(n);
		} catch ( program37_myexception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}


