package set_5;

public class qn_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		try {

		System.out.println(a[6]=200);
		System.out.println(a[6]=200/0);

		} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("Exception is : "+ e);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception is : "+ e);
		}finally {
		a[0]=1;
		System.out.println("The first element in the array is : "+ a[0]);
		System.out.println("The finally element is executed ");
		}
	}

}
