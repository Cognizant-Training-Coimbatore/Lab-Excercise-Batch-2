import java.util.Scanner;

public class count_odd_nums {

	public static void main(String[] args) 
	{	int num=0,count=0;
		System.out.println("enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			if (num%2!=0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	
	

	}

}
