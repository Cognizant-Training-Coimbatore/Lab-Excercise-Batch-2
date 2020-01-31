import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m=0;
		int flag=0;
		
		while(n!=0)
		{
			m=n%4;
			n=n/4;		
			if(n==1 && m==0)
			{				
				System.out.println("It is power of 4");
				flag=1;
				break;
			}
		
		}
		if(flag==0)
		{
			System.out.println("Not power of 4");
		}
	}
	
}
