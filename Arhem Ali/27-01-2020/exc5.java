import java.util.Scanner;

public class exc5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark");
		int m=sc.nextInt();
		try
		{
			if(m<0)
					throw new myexceptions("invalid");
		}
		catch(Exception e)
		{
			System.out.println("enter valid marks  "+e);
		}
			
		
	}

}
