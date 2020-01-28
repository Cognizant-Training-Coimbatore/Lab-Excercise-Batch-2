class inherite
{
	int a=2;
}
class aa extends inherite
{
	int b=5;
}
class bb extends aa
{
	int f=a+b;
	void display()
	{
		System.out.println(f);
	}
}
public class qu1{

	public static void main(String[] args) {
		bb ob= new bb();
		ob.display();
		

	}

}
