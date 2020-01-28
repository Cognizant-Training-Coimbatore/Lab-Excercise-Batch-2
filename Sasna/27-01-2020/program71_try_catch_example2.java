
public class program71_try_catch_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[2];
			System.out.println("access element three:" +a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception thrown:" +e);
		}
		System.out.println("out of the block");
	}

}
