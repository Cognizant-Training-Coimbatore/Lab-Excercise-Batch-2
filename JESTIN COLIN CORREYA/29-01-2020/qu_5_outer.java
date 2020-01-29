package other;
class outerclass
{
	public void display()
	{
		System.out.println("outer");
	}
	class innerclass
	{
		public void display()
		{
			System.out.println("inner");
		}
	}
}
public class qu_5_outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outerclass obj=new outerclass()	;
outerclass.innerclass obj1=obj.new innerclass();
obj.display();
obj1.display();

}}
