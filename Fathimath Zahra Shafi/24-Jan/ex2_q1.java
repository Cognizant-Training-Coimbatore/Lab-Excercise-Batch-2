class a
{
	int x=90;
	
}

class b extends a
{
	int y=2;
	void display()
	{
		System.out.println(x+y);
	}
}



public class ex2_q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  b obj=new b();
  obj.display();
	}

}
