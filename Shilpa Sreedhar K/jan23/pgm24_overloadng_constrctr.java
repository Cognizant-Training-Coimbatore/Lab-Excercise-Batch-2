class test3
{
 test3()
 {
	 System.out.println("test3 constructor is running...");
 }
 test3(int a,int b)
 {
	 System.out.println("test3 constructor2 is running...");
 }
}
public class pgm24_overloadng_constrctr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3 obj1=new test3();
		test3 obj2=new test3(10,10);
		

	}

}
