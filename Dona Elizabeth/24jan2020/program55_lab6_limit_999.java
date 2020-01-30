import java.util.Scanner;

public class program55_lab6_limit_999 {

	public static void main(String[] args) {
		int a=0,b,count=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("You can enter numbers until you type -999");
		a=sc.nextInt();
		while(a!=-999)
		{
			
			count++;
			sum=sum+a;
			a=sc.nextInt();
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+(sum/count));
		
	}

}
