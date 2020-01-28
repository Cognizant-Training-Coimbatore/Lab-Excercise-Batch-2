class ab
{
	int a=12;
}
class bc extends ab
{
	int b=15;
}
class cd extends bc
{
	int c=a+b;
	void display()
	{
		  System.out.println(c);
	}
}
public class Ass12 {

	public static void main(String[] args) {
		cd ob=new cd();
		ob.display();

	}

}
