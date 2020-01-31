import java.util.Scanner;

public class program11_pow4 {

	public static void main(String[] args) {
		int n,r,m=0,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=0;i<n/4;i++)
		{
			if(Math.pow(4, i)==n)
			{
				flag=1;
			}
			
		}
		if(flag==1)
		{
			System.out.println("power of 4");
		}
		else
		{
			System.out.println("not power of 4");
		}
		
	}
}

