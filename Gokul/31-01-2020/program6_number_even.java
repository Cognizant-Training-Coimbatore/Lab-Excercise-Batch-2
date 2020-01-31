import java.util.Scanner;

public class program6_number_even {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		if(i%2==0)
			System.out.println(1);
		else
			System.out.println(0);
	}

}
