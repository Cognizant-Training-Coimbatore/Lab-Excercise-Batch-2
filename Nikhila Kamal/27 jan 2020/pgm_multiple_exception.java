
public class pgm_multiple_exception {

	public static void main(String[] args) {
		try
		
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception occurs: " + e);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutOfBounds Exception: " + e);
			}
			catch(Exception e)
			{
				System.out.println("parent Exception occurs");
			}
		
		}

	}


