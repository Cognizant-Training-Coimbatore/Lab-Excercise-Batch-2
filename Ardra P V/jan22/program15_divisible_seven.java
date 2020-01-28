import java.util.Scanner;

public class program15_divisible_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		System.out.println("Enter the value of y");
		Scanner scanner=new Scanner(System.in);
		y=scanner.nextInt();
		if(y%7==0) {
			System.out.println(y+ " is divisible by 7");
		}
		else
		{
			System.out.println(y+ " is not divisible by 7");
		}
	}

}
