import java.util.Scanner;
public class program10_odd_even {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n%2==0) 
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
