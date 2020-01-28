import java.util.Scanner;

public class prob7 {

	static void validate()throws myexceptions
		{
			int Empcode;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee Code");
			Empcode=sc.nextInt();
			if(Empcode<101 || Empcode>200)
			throw new myexceptions("not valid");
			else
				System.out.println("Valid");
		}
public static void main(String[] args)
		{
			try
			{
				validate();
			}
			catch(Exception m) 
			{
				System.out.println("Exception occured: "+m);
			}
		}

	}
