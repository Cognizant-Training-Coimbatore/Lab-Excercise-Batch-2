package demo;

class sample1{
	static int y;
	void display()
	{
		y++;
		System.out.println("Value of Y : " + y);
	}
}

public class program18_static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample1 obj1 = new sample1();
		obj1.display();
		sample1 obj2 = new sample1();
		obj2.display();

	}

}
