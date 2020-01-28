class  b1
{
	int x=56;
	
	}

class b2 extends b1
{
	int x=78;
	void display()
	{
		System.out.println(super.x);
	}
}
public class super_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b2 obj=new b2();
obj.display();

	}

}
