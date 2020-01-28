import java.util.Scanner;

public class program3_Null {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
	try {
		
			if(s.length()>0)
				System.out.println("The string is "+s);
	
		else 
			throw new NullPointerException("Error");
	}
		catch(NullPointerException e)
	{
			System.out.println("Error");
	}

	}

}
