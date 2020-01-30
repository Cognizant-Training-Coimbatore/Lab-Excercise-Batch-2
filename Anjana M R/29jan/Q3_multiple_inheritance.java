interface interface_1
{
	void display1();
}
interface interface_2
{
	void display2();
	
}
class mul implements interface_1,interface_2
{

	@Override
	public void display2() {
		String name="Anjana";
		int age=23;
		System.out.println("Name  :"+name);
		System.out.println("Age  :"+age);
		
	}

	@Override
	public void display1() {
		String place="Ernakulam";
		System.out.println("Place  :"+place);
		
	}
	
}
public class Q3_multiple_inheritance {

	public static void main(String[] args) {
		mul obj=new mul();
		obj.display1();
		obj.display2();
	}

}
