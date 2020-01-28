import java.util.Scanner;

public class pgm50_integers_list {

	public static void main(String[] args) {
		System.out.println("enter the first number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		
		System.out.println("enter the last number");
		Scanner s=new Scanner(System.in);
		int n2=s.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			System.out.println("integers between n1 and n2:" + i);
		}
	}

}
