import java.util.Scanner;

public class divisiblity {

	public static void main(String[] args) {
		int num;
		System.out.println("enter a num");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		if(num%7==0)
		{
			System.out.println("divisible by 7");
		}
		else {
			System.out.println("not divisible by 7");
		}

	}

}
