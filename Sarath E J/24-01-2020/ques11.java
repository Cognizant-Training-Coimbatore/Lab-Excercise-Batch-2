class t
{
	int a = 2;
}
class y extends t
{
	int b = 5;
}

class inherits extends y
{
	int c =a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherits o = new inherits();
		o.display();
	}

}
