package demo;
class x{
	static int i;
	void display() {
		i++;
		System.out.println(i);
	}
}
public class static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x obj=new x();
		obj.display();
		x obj1=new x();
		obj1.display();
		

	}

}
