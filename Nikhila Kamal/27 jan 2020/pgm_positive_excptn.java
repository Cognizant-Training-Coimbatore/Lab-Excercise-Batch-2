import java.util.Scanner;

public class pgm_positive_excptn {
	static void validate(int n)throws myexceptions
	{
		if(n<0)
		throw new myexceptions("not valid");
		else
		System.out.println("valid");
	}
	public static void main(String[] args) {
		try
		{
			
		
		System.out.println("enter a number");
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
