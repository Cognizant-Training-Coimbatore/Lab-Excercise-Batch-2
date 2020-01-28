import java.util.Scanner;

public class program12_sum_of_digits {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the number");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();
		int sum=0;
		while(a!=0)
		{
			sum=sum+(a%10);
			a=a/10;
		}
		System.out.println("The sum of digits is "+sum);
		
		

	}

}
