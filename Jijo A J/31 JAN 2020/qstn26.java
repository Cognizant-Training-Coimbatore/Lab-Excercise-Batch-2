import java.util.Scanner;

public class qstn26 {

public static void main(String args[])
{
	int a[]=new int[100];
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter the numbers");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int min=a[1];
	for(int i=0;i<n;i++)
	{
		if(a[i]<min) {
			min=a[i];
		}
	}
	System.out.println("minimum :"+min);
	}

}
