import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a[]=new int[5];
		int b[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];		
		}
		System.out.println("\n\n\ncopied array is ");		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);		
		}
		
	}

}
