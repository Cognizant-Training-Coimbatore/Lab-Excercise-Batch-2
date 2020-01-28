class parent
{
	void display()
	{
		System.out.println("This is parent class");
	}
	
}
 class child extends parent
 {
	 void print()
	 {
		 System.out.println("This is child class");
	 }
 }
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent ob1 = new parent();
		child ob2 = new child();
		ob1.display();
		ob2.display();
		ob2.print();

	}

}
