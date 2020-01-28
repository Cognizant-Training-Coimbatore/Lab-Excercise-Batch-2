
public class program4_multiple_catch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception  occurs");
		}
		catch( Exception e) {
			System.out.println("Parent exception occurss");
		}

	}

}
