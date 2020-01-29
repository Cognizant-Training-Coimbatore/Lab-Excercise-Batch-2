package abc;
interface test
{
	void square();
}
class arithmetic implements test
{
	public void square()
	{
		System.out.println("square");
	}
}
class ToTestInt 
{
	arithmetic obj1=new arithmetic();
	void display()
	{
		System.out.println("totestint");
		obj1.square();
	}
}
public class date29_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ToTestInt obj2=new ToTestInt();
obj2.display();
	}

}
