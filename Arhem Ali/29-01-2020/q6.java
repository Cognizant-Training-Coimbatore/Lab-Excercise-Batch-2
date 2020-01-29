package newjava;
abstract class sample1
{
	abstract void display();
}
class abs extends sample1
{
	void display()
	{
		System.out.println("mm");
	}
}
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abs ob=new abs();
		ob.display();

	}

}
