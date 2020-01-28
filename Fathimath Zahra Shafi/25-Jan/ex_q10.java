import java.util.Scanner;

public class ex_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int small;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
			
	}
		small=a[0];
		for(int i=1;i<5;i++)
		{
			if(a[i] < small)
			{small=a[i];}
			
		}
		System.out.println("smallest number: " +small);
		

	}

}
