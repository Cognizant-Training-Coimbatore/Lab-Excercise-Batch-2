import java.util.Scanner;

public class program19_arra_specific_val {

	public static void main(String[] args) {
		int n,value,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		n=sc.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter a value");
		value=sc.nextInt();
		for(i=0;i<n;i++)
		{
		if(a[i]==value)
		{
           f=1;
           break;
	    }
		else
		{
			f=0;
		}
		}
		if(f==1)
		{
			System.out.println("value found");
		}
		else
		{
			System.out.println("vale not found");
		}
	}
}
