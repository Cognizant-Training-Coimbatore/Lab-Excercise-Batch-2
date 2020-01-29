package exercise;
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
public class Q5 {

	public static void main(String[] args)
	{
		
outerclass obj=new outerclass()	;
outerclass.innerclass obj1=obj.new innerclass();
obj.display();
obj1.display();

}}