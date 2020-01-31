import java.util.Scanner;

public class program8_3_integers {

	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers");
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		
		if((a2>a1) && (a3>a2))
		{
			System.out.println("True");
		}
	}

}
