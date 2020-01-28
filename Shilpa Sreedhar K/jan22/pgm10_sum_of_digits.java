import java.util.Scanner;

public class pgm10_sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,num;
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter a number :");
		  num = s.nextInt();
		while( num > 0)
		{
		r = num%10;
		num = num / 10;
		sum = sum + r;
		}
		System.out.print("sum of digits is :" +sum);
	}

}
