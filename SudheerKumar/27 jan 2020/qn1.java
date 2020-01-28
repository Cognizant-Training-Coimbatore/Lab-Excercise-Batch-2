import java.util.Scanner;
public class qn1 {
	static void validate(int n) throws  program37_myexception
	{
		if(n>0)
		{
			System.out.println("accepted");
		}
		else
		{
			throw new  program37_myexception("not valid");
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

