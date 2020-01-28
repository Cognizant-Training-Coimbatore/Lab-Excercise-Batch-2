import java.util.Scanner;

public class exercise7_sum_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,dig,temp,sum=0;
		
		System.out.println("enter a number");
		Scanner scanner=new Scanner(System.in);
		n= scanner.nextInt();
		temp=n;
		while(temp!=0)
		{
			dig=temp%10;
			sum+=dig;
			temp=temp/10;
			
		}
		
		System.out.println("sum of digits: " +sum);

	}

}
