import java.util.Scanner;

public class program12_sum_digits 
{

	public static void main(String[] args) 
	{
		int sum=0,num,m;
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		while(num>0)
		{
			m=num%10;
			sum=sum+m;
			num=num/10;
		}
		System.out.println("Sum of digits= " +sum);
		// TODO Auto-generated method stub

	}

}
