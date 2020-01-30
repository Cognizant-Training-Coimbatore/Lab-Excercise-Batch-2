import java.util.Scanner;

public class Program_66 {

	public static void main(String[] args) {
		int sum=0,avg;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the numbers");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/5;
		System.out.println("The sum of numbers is "+sum);
		System.out.println("The average of numbers is "+avg);

	}

}
