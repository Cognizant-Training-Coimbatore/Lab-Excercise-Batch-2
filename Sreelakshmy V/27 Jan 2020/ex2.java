[public class ex2 {

	public static void main(String[] args) {
	try
	{
		int a[]=new int[2];
		System.out.println("Acess element three:" +a[3]);
	}
catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Exception thrown:" +e);
	}
	System.out.println("Out of block");
	}

}
