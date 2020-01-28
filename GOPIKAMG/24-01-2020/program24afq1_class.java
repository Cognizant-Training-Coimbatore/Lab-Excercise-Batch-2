class a2
{
	int x=3;
}

class  b2 extends  a2
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
	
}
public class program24afq1_class 
{
	public static void main(String[] args) {
		
 b2 obj=new b2();
 obj.display();
}
}