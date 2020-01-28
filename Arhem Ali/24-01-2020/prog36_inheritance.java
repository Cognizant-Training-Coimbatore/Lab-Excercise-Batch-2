class c1{
	int x=5;
}
class c2 extends c1
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}

public class prog36_inheritance {

	public static void main(String[] args) {
		c2 ob= new c2();
		ob.display();
		
		
	}

}
