interface test
{
	void square();
	
}
class arithmetic implements test
{

	@Override
	public void square() {
	 String name="Anu";
	 System.out.println("Name of the employee  :"+name);
	}	
}
class ToTestInt extends arithmetic
{
	void display()
	{
		String id="457899";
		System.out.println("id  :"+id);
	}
}
public class Q4_interface_class {

	public static void main(String[] args) {
		ToTestInt obj=new ToTestInt();
		
		obj.square();
		obj.display();

	}

}
