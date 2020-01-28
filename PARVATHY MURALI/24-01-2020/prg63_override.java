class javaa
{
	void display()
	{
		System.out.println("super class");
	}
}
class javachild extends javaa
{
	void display()
	{
		System.out.println("subclass");
	}
}
public class prg63_override {

	public static void main(String[] args) {
		javaa ob=new javaa();
		javachild obj=new javachild();
		ob.display();
		obj.display();
		

	}

}
