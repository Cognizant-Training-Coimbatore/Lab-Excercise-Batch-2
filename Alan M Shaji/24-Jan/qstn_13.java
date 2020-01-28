class parent
{
	void pdisplay()
	{
		System.out.println("this is parent class");
	}
}
class child extends parent
{
	void cdisplay()
	{
		System.out.println("this is child class");
	}
}
public class qstn_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent obj1=new parent();
		child obj2= new child();
		System.out.println("Method of parent class with obj of parent");
		obj1.pdisplay();
		System.out.println("Method of child class with obj of child");
		obj2.cdisplay();
		System.out.println("Method of parent class with obj of child");
		obj2.pdisplay();
	}

}
