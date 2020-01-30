package demo;

public class program35_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[2];
		try {		
			System.out.println("Access element 3 : " + a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception thrown");
		}
		finally {
			a[0] = 6;
			System.out.println("First element value: " + a[0]);
			System.out.println("The finally statement is executed");
		}
	}

}
