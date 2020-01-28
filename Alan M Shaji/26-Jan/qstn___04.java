import java.util.Scanner;

public class qstn___04 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number...");
		int m=sc.nextInt();
		try
		{
			a[6]=m;
			System.out.println(m/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error in the code : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error in the code : "+e);
		}
		finally
		{
		a[0]=m;
		System.out.println(a[0]);
		System.out.println("out of the block");
		}

	}

}
