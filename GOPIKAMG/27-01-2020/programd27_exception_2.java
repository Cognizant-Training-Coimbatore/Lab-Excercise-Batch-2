
public class programd27_exception_2 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[2];
			System.out.println("Accesss element three:" +a[3]);
		}
catch(ArrayIndexOutOfBoundsException e)
		{
	System.out.println("Exception thrown:"+e);
		}
		System.out.println("Out of the block");
	}

}
