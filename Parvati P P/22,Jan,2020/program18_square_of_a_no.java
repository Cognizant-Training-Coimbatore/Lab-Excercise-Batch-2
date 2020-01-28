import java.util.Scanner;

public class program18_square_of_a_no {

	public static void main(String[] args) {
		int num,sqr=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no...");
		num= sc.nextInt();
		sqr=num*num;
		System.out.println("Square of "+num+" is "+sqr);

	}

}
