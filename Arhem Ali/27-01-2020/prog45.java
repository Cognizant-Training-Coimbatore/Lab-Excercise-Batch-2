
public class prog45 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[2];
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown: "+e);
		}
		System.out.println("out of the block");

	}

}
