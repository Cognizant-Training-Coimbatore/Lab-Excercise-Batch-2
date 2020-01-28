class a
{
	int x=3;
}
class b extends a
{
	int y=4;
}
class inherit extends b
{

	
	void display()
	{
		int s;
		s=x+y;
		System.out.println(s);
	}
}
public class Question_11 {

	public static void main(String[] args) 
	{
		inherit obj= new inherit();
		obj.display();
	}

}
