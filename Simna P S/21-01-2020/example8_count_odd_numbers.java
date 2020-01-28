import java.util.Scanner;

public class example8_count_odd_numbers 
	{

	public static void main(String[] args) 
	{
		int num=5,n,c=0,i;
		Scanner scanner = new Scanner(System.in);
		for(i=0;i<num;i++)
		{
		System.out.println("enter the number");
		n= scanner.nextInt();
		if(n%2!=0) 
		{
			c=c+1;
		}
		
		}
		System.out.println("The number of odd numbers are: "+ c);
	}

}
