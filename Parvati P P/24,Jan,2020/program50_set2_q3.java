import java.util.Scanner;

public class program50_set2_q3 {

	public static void main(String[] args) {
		int a[]= new int[10];
		int sum=0, h,l=0,t=0;
		System.out.println("Enter the list:");
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<10;i++)
		{
		int n=sc.nextInt();
		a[i]=n;
		sum=sum+a[i];
		}
		System.out.println("Avg:"+sum/10);
		for(int i=1;i<10;i++)
		{
		if(a[0]>a[i])
		{
		a[0]=a[i];

		}
		}
		System.out.println("Lowest number is:"+a[0]);
		for(int i=1;i<10;i++)
		{
		if(a[0]<a[i])
		{
		a[0]=a[i];

		}
		}
		System.out.println("Largest number is:"+a[0]);
	
	}


}
