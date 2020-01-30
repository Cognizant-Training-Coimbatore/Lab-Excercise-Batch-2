class a1
{
	int x=4;
}

class a2 extends a1
{
	int y=8;
	
}

class a3 extends a2
{
	int z=2;
	void display()
	{
	System.out.println(x+y+z);
	}
	
}

public class program24_multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a3 obj=new a3();
		obj.display();

	}

}
