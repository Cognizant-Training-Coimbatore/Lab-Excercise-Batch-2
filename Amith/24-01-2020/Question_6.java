import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) 
	{
	int a[];
	int d = 0;
	a=new int [100];
	System.out.println("enetr your numbers");
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<100;i++)
	{
		a[i]=sc.nextInt();
		if(a[i]==999)
		{
			d=i;
			break;
			
		}
	}
	
	int sum=0;
	for(int i = 0;i<d;i++)
	{
		sum=sum+a[i];
	}
	System.out.println("sum is :"+sum+"average is "+(sum/d));

	}

}
