import java.util.Scanner;

public class average_and_sum {

	public static void main(String[] args) {
		int i,x,s=0;
		double avg;
		System.out.println("enter the five outputs");
		for(i=0;i<=4;i++)
		{
			Scanner scanner=new Scanner(System.in);
			x=scanner.nextInt();
			s=s+x;
		}
		
avg=s/5;
System.out.println("the sum is" +s);
System.out.println("the avg is"+avg);
	}

}
