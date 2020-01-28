import java.util.Scanner;

public class pgm22_count_odd_nos {

	public static void main(String[] args) {
		int i,n=0,c=0;
		System.out.println("enter the numbers");
		for(i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		
		if(n%2==1)
		{
			c=c+1;
			System.out.println("count of odd numbers:" + c);
		}
		}
		
	}

}
