import java.util.Scanner;

public class program48_set2_q1 {

	public static void main(String[] args) {
		int a,b,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter frst integer..");
		a=sc.nextInt();
		System.out.println("Ente sec integer..");
		b=sc.nextInt();
		if(b>a) {
		for(i=0;i<b-2;i++)
		{
			a=a+1;
			System.out.println(a);
		}
		}
		else if(b<a)
		{
			for(i=a-1;i>b;i--)
			{
				a=a-1;
				System.out.println(a);
			}
		}	
	}

}
