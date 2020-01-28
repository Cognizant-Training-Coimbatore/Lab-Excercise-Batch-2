
public class program32 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[2];
			System.out.println("access element three:"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown:"+e);
		}
		System.out.println("out of the block");
		// TODO Auto-generated method stub

	}

}
