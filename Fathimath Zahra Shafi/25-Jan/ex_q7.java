import java.util.Scanner;

public class ex_q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
			
	}
		
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("copied array: ");

		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
