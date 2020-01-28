import java.util.Scanner;

public class program22_count_odd_numbers {

	public static void main(String[] args) {
		int n,odd_nos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2!=0)
			{
				odd_nos++;
			}
		}
		System.out.println("No of odd numbers="+odd_nos);
		
		

	}

}
