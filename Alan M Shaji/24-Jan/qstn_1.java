import java.util.Scanner;

public class qstn_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 2 no.s\t:\t");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			for(int i=b;i<=a;i++)
				System.out.println(i);
		else if(a<b)
			for(int i=a;i<=b;i++)
				System.out.println(i);
		else
			System.out.println(a);

	}

}
