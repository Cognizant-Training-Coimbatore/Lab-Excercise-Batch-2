class parent{
	void display()
	{
		System.out.println("this is parent class");
	}
}
class child extends parent{
	
	void display1() {
		System.out.println("this is child class");
}}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child obj =new child();
parent obj1=new parent();
obj1.display();
obj.display1();
obj.display();
	}

}