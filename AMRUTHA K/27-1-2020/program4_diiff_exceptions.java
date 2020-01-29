package packss;

public class program4_diiff_exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		try {
			//System.out.println(a[4]=50/0);
			System.out.println(a[6]=34);
		}
		catch(ArithmeticException e) {
			System.out.println("arithmetic"+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array bound"+e);
			
		}
		finally {
			a[0]=8;
			System.out.println("value "+a[0]);
			System.out.println("final executed");
		}

	}

}
