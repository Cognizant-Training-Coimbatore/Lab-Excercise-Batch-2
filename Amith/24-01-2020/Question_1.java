import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) 
	{
	int n1,n2,i;
	System.out.println("enter two numbers");
	Scanner sc =new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();
	if(n1>n2)
	{
		for(i=n2;i<=n1;i++)
		{
			System.out.println(i);
		}
	}
	else
	{
		for(i=n1;i<=n2;i++)
		{
			System.out.println(i);
		}
	}
	
	
	}

}
