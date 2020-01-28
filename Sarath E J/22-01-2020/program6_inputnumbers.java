import java.util.Scanner;

public class program6_inputnumbers {

	public static void main(String[] args) 
	
	{
		
			int sum=0,avg=0;
			Scanner sc = new Scanner(System.in);
			int a,b,c,d,e;
			System.out.println("Enter the inputs: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			d=sc.nextInt();
			e=sc.nextInt();
			
			sum=a+b+c+d+e;
			avg=sum/5;
			System.out.println("sum="+sum);
			System.out.println("average="+avg);
	}

}
