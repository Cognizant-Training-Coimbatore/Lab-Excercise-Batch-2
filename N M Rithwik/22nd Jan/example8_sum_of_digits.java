import java.util.Scanner;

public class example8_sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,sum=0,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		x = sc.nextInt();
		temp = x;
		while(temp!=0)
		{
			sum = sum + (temp%10);
			temp = temp/10;
		}
		System.out.println("The sum of the digits is : " + sum);
	}

}
