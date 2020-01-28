class Programming
{
	String name,str;
	void display()
	{
		name="I love Programming languages";
		System.out.println(name);
	}
	void display(String s)
	{
		str=s;
		System.out.println("I love "+str);
	}
}
public class program_programming {

	public static void main(String[] args)
	{
		
		Programming obj=new Programming();
		obj.display();
		obj.display("java");
		

	}

}
