package packTwo;
import packOne.exercise25_Q3a;
class test1 extends exercise25_Q3a
{
	void display2()
	{
		System.out.println("Displaying from sub class..");
	}
}
public class exercise25_Q3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 obj = new test1();
		obj.display2();
		obj.display1();
	}

}
