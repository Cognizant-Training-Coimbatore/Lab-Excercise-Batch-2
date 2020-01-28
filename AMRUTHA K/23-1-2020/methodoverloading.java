package demo;
class test2{
	void display() {
		System.out.println("display method without argument");
	}
	void display(int x)//change the parameters of of same method-method overloading
	{
		
		System.out.println("new displaymethod");
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 obj=new test2();
		obj.display();
		obj.display(5);

	}

}
