import java.util.Scanner;

public class qu6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int guess= sc.nextInt();
		int i=0,sum=0;
		float avg=0;
		while (guess!= -999)
		{
			i=i+1;
			sum=sum+guess;
			avg=sum/i;
			guess= sc.nextInt();
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
