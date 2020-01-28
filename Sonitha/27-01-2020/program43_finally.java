
public class program43_finally {

	public static void main(String[] args) {
		
		int a[]= new int[2];
		// TODO Auto-generated method stub
try {
	System.out.println("Access element three :" + a[3]);
}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Exception thrown :"+ e);
}finally {
	a[0]= 0;
	System.out.println("First element value : "+ a[0]);
	System.out.println("The finally element is executed");
}
	}

}
