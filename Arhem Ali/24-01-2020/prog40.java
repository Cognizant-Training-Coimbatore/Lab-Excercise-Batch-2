class javaclassa
{
	void display()
	{
		System.out.println("Javaclassa is running");
	}
}
class javaclassb extends javaclassa
{
	void display()
	{
		System.out.println("Javaclassb is running");
	}
}
public class prog40 {

	public static void main(String[] args) {
		javaclassb obj= new javaclassb();
		obj.display();

	}

}
