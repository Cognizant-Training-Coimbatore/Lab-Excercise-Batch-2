package demo;

public class program_33_exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int a[]=new int[5];
			a[5]=30/0;
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
             		{
			
			
			System.out.println("array out of bound occurs");
		}
		catch (Exception e)
		{
			System.out.println("parent exception occurs");
		}
           
	



	}

}
