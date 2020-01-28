import java.util.Scanner;

public class date_27_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		try
		{
			
			int n1,n2;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 2 numbers");
			n1=sc.nextInt();
			n2=sc.nextInt();
			int d=n1/n2;
			a[6]=d;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("exception thrown :"+e);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			System.out.println("out of the block");
		}
		finally
		{
			a[0]=6;
			System.out.println("first element value:"+a[0]);
			System.out.println("finally statement is executed");
		}
	}

}
