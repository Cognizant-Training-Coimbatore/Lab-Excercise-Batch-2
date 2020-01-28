import java.util.Scanner;

public class program6_postive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		System.out.println("Enter the value of y");
		Scanner scanner=new Scanner(System.in);
		y=scanner.nextInt();
		if(y>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
	}

}
