package demo;

public class program34_multipleCatchBlock {

	public static void main(String[] args) {
	
		try {
			int a[]= new int[5];
			a[5] = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception occurs");
		}
		catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		
	}
}
