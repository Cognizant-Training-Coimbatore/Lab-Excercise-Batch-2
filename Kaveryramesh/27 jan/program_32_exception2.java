package demo;

public class program_32_exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			int a[]=new int[2];
			System.out.println("Access the elrment"+a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
             		{
			
			
			System.out.println("Exception thrown "+e);
		}
            System.out.println("out of block");
	}

}
