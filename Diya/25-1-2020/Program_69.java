import java.util.Scanner;

public class Program_69 {
	public static void main(String[] args) {
	int flag=0,i;
	int a[]=new int[10];
	Scanner sc = new Scanner(System.in);
	for(i=0;i<10;i++)
	{
		System.out.println("Enter the number");
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the number to verify");
	int n=sc.nextInt();
	for(i=0;i<10;i++)
	{
		if(a[i]==n)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("The number is present");
	}
	else
	{
		System.out.println("The number is absent");
	}
}
}

