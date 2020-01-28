import java.util.Scanner;

public class program08_count_odd {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e;
		int x =0;
	
		int count=0;
		System.out.println("Enter the 5 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		if(a%2!=0)
		{
			
			count= +1;
		}
		if(b%2!=0)
		{
			
			count= x+1;
		}
		if(c%2!=0)
		{
			count= x+1;
			
			
		if(d%2!=0)
		{
			
			count= x+1;
			
		}
		if(e%2!=0)
		{
			count= x+1;
		
		}
		
		System.out.println("The number of odd numbers =" +count);		

	}

}
}
