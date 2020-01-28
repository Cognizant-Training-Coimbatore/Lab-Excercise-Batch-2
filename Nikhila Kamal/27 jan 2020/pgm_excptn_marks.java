import java.util.Scanner;

public class pgm_excptn_marks {
	static void validate(int n)throws myexceptions
	{
		if(n<0)
		throw new myexceptions("Invalid mark entered");
		else
		System.out.println("valid");
	}

	public static void main(String[] args) {
		try
		{
			
		
		System.out.println("enter the marks");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		validate(n);
	
	}
		catch(Exception m)
		{
			System.out.println("exception occured: " + m);
		}


	}

}
