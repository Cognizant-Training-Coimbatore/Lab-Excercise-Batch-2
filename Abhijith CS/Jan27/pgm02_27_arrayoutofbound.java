package exceptionhandling;

public class pgm02_27_arrayoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[2];
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown "+e);
		}
	}

}
