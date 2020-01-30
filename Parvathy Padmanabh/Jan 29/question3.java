interface Father
{
	int x=10;
}
interface Mother
{
	int y=20;
}
class child implements Father,Mother
{
	int sum= x+y;
	void display()
	{
		System.out.println("Child gets both father and mother : " + sum);
	}
}
public class question3 {

	public static void main(String[] args) 
	{
		child obj = new child();
		obj.display();

	}

}
