import java.util.Scanner;

public class program10_sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,sum=0;
		System.out.println("Enter the value of y");
		Scanner scanner=new Scanner(System.in);
		y=scanner.nextInt();
		while(y!=0) {
			int x=y%10;
			y=y/10;
			sum=sum+x;
			
		}
		System.out.println("Sum of digit is : "+sum);
	}

}
