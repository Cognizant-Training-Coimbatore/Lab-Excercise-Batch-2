import java.util.Scanner;

public class sum_digits {

	public static void main(String[] args) {
		int num,b;
		int sum=0;
		System.out.println("enter the digit");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		while(num>0)
		{
			b=num%10;
			sum=sum+b;
			num=num/10;

	}
System.out.println("sum of digits is " +sum);
}
}