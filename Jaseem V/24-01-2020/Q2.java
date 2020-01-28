interface ab{
	default void display() {
		System.out.println("hello");
	}
}
interface cb{
	default void display() {
		System.out.println("world");
	}
}
class bb implements ab,cb
{
	public void display()
	{
		ab.super.display();
		cb.super.display();
		
	}
	}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bb obj=new bb();
obj.display();
	}

}