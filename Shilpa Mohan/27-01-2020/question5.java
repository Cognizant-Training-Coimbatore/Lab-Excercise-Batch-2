import java.util.Scanner;

public class question5 {

		static void validate(int x)throws myexceptions
		{
			if(x<0)
				throw new myexceptions("this is invalid");
			else
				System.out.println("this is valid");
			public static void main(String[] args) {
				
				System.out.println("To check whether the marks entered is valid or not");
				Scanner sc = new Scanner(System.in);
				x=sc.nextInt();
				
				try
				{
					validate(x);
				}
				catch(Exception m)
				{
					System.out.println("Exception occured " +m);
				}
		}
	}

}
