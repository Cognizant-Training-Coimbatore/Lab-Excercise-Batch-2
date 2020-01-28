import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		int o,n;
		System.out.println("Enter new meter reading");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter old meter reading");
		o=sc.nextInt();
		int unit=n-o;
		if(unit>1 && unit<=100)
		{
			System.out.println("Free");
		
		}
		else if(unit>100 && unit<=200)
		{
			System.out.println(unit*1);
		}
		else if(unit>200 && unit<=300)
		{
			System.out.println(unit*2);
		}
		else if(unit>300 && unit<=400)
		{
			System.out.println(unit*3);
		}
		else 
		{
			System.out.println((0.1*unit*4)+(4*unit));
		}
		
	}

}
