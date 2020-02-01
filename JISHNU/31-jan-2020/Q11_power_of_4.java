import java.util.Scanner;

public class Q11_power_of_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num%4==0) 
		{
		while(num>=4)
		{
		num=num/4;
		}
		if(num==1)
		{
			System.out.println("Power of 4");
		}
			
		else
		{
			System.out.println("not power of 4");
		}
		}
		else
		{
			System.out.println("not power of 4");
		}
	}

}
