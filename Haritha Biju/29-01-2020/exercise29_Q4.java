interface test
{
	void square();
}
class arithmetic implements test
{
	int x;
	@Override
	public void square() {
		// TODO Auto-generated method stub
		System.out.println("Suare = " + x*x);
	}
	
}
class ToTestInt extends arithmetic
{
	arithmetic obj = new arithmetic();{
	x=10;
	obj.square();
}}
public class exercise29_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToTestInt obj = new ToTestInt();
		obj.square();
	}

}
