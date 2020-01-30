package Package4; //Write a program to create interface named test. In this interface the member function is square. 
                  //Implement this interface in arithmetic class. 
                  //Create one new class called ToTestInt in this class use the object of arithmetic class. 
interface test{
	  void Square(int x); 
}
class Arithmetic implements test
{
	int x;
	public void Square(int b) 
		{
			b=x;
			System.out.println("The square is: "+b*b);
		}
	
}
class ToTestInt
{
	void return_ans(int i)
	{
	Arithmetic obj=new Arithmetic();
	obj.Square();
	}
}
public class program128_set7_q4 {

	public static void main(String[] args) {
		ToTestInt obj1=new ToTestInt();
		obj1.return_ans(5);
		
	}

}
