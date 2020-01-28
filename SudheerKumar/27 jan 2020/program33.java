public class program33 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic expressions occurs");
		}
      catch(ArrayIndexOutOfBoundsException e)
		{
    	  System.out.println("Arrayindexoutofbounds exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("parent exception occurs");
		}
	}

}
