import java.util.Scanner;

public class qs6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[5];
		int s=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value: ");
			int b= sc.nextInt();
			 s=s+b;
		}
		int av=s/5;
		System.out.println("sum "+s+"avg: "+av);
	}

}
