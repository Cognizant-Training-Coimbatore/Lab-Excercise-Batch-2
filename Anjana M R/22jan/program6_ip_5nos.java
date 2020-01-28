import java.util.Scanner;
public class program6_ip_5nos {

	public static void main(String[] args) {
		int n,i,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter  limit");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
		
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			
			s=s+a[i];
		}
       System.out.println("Sum = "+s);
       float av=s/n;
       System.out.println("Average"+av);
	}

}
