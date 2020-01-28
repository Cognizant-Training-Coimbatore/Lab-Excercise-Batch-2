import java.util.Scanner;

public class questn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 10 numbers");
		Scanner sc=new Scanner(System.in);
		Integer[]numbers=new Integer[10];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=sc.nextInt();
			
		}
		int min=numbers[0];
		int max=numbers[0];
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			if (numbers[i] > max) 
			{
				max = numbers[i];
			}
			if (numbers[i] < min) 
			{
				min = numbers[i];
			}
			sum=sum+numbers[i];
		}
		double avg=sum/10;
		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
		System.out.println("The average is " + avg);
	}

}
