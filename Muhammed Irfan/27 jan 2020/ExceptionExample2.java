package monday;

public class ExceptionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a[]=new int[2];
			System.out.println("ACESS ELEMENT THREE: "+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown : "+e);
		}
		System.out.println("Out of box");
	}

}
