import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args)
	{
		int n1,i;
		System.out.println("enter the numbers");
		Scanner sc =new Scanner(System.in);
		n1=sc.nextInt();
		while(n1>0)
		{
			for(i=1;i<=10;i++)
			{
			int p=n1*i;
			System.out.println(n1+"*"+i+"="+p);
			}
			n1--;
		}

	}

}
