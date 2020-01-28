import java.util.Scanner;
public class question3 {

		static void validate (String x) throws myexceptions
		{
			if(x.length()==0)
				throw new myexceptions("this is not string");
			else
				System.out.println("this is string");
		}
		public static void main(String[] args) {
			String x;
			System.out.println("to check whether it is a string");
			Scanner sc = new Scanner(System.in);
			x=sc.nextLine();
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
