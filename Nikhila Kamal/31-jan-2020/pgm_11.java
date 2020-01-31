import java.util.Scanner;

public class pgm_11 {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0;int flag=0;
		while(n!=0)
		{
			m=n%4;
			n=n/4;
			if(n==1&&m==0)
			{
				System.out.println("power of 4");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("not power of 4");
		}

	}

}
