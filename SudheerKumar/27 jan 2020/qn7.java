import java.util.Scanner;
public class qn7 {
	static void validate(int code) throws program37_myexception
	{
		if(code>=101 && code<=200)
		{
			System.out.println("Accepted");
		}
		else
			throw new program37_myexception("Rejected");
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empcode");
		int code=sc.nextInt();
		try
		{
			validate(code);
		}
		catch(Exception m)
		{
			System.out.println(m);
		}
	}

}

