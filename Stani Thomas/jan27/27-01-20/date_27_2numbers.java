import java.util.Scanner;

public class date_27_2numbers
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
int n1,n2;
Scanner sc=new Scanner(System.in);
System.out.println("enter 2 numbers");
n1=sc.nextInt();
n2=sc.nextInt();
System.out.println(n1/n2);
		}
		catch(Exception e)
		{
			System.out.println("error in the code"+e);
			System.out.println("out of the block");
		}
		
	}

}
