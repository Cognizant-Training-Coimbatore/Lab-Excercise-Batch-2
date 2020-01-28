import java.util.Scanner;
public class program8_positive_negative {

	public static void main(String[] args) {
		int num=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no..");
		num=sc.nextInt();
		rem=num%2;
		if(rem==0)
			System.out.println("Even no..");
		else
			System.out.println("Odd no..");
		

	}

}
