import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(b>a && c>b)
		{
            System.out.println("True");		
		}
		else
		{
			System.out.println("False");
		}

	}

}
