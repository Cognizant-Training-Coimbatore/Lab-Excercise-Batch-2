import java.util.Scanner;

public class pgm_throws_ex {

	public static void main(String[] args) {
		try

		{

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the mark: ");

		int n=sc.nextInt();

		

		if((n<50)||n>200)

		

			throw new Exception("invalid");

		System.out.println("mark="+n);

		}

		catch(Exception e)

		{

			System.out.println(e);

		}

	}



	}


