import java.util.Scanner;

public class program12_sum_digit 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		int reminder;
		while(temp>0)
		{
			reminder=temp%10;
			temp=temp/10;
			sum=sum+reminder;
		}
		System.out.println("Sum of digit of the number: "+sum);
	}

}
