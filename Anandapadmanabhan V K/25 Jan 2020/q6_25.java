import java.util.Scanner;

public class q6_25 {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int numbers1[]=new int[5];
		for(int i=0;i<5;i++)
		{
			number=sc.nextInt();
			numbers1[i]=number;
		}
		int sum=numbers1[0]+numbers1[1]+numbers1[2]+numbers1[3]+numbers1[4];
		double avg=sum/5;
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + avg);
	}

}
