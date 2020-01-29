interface B
{
	int x=10;
}
interface C
{
	int y=20;
}
class sample implements B,C
{
	int result=x+y;
	public void display()
	{
		System.out.println(result);
	}
}
public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj=new sample();
		obj.display();
	}

}
