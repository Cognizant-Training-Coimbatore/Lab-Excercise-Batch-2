package samplepackage;
 interface test
{
	public int  square(int a);
}

class arithmetic implements test
{
   int s=10;
   //inside arithmetic class implemented method square
   
	@Override
	public int square(int b) {
		System.out.println("Square of "+b+ " is "+(b*b));
		return s;
	}
	
}
public class j29_q4_ToTestInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test ob =new arithmetic();//object of arithmetic class
ob.square(10);

	}

}
