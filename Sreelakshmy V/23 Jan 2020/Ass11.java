
class a
{
	int a=2;
}
class b extends a
{
	int b=5;
}
class inherit extends b
{
	int c=a+b;
	void display()
	{
		  System.out.println(c);
	}
}
public class Ass11 {

	public static void main(String[] args) {
		inherit ob=new inherit();
		ob.display();

	}

}
