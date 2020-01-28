package exception_handling;

public class exception_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a[]=new int[5];
	a[5]=30/0;
}
catch(ArithmeticException e)
{
	System.out.println("arithmetic exception occurs");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("arrayindexoutofbounds exception occurs");
}
catch(Exception e)
{
	System.out.println("parent exception occurs");
}

	}

}
