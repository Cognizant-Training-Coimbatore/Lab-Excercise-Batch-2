package demo;
class a
{
	int a=4;
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

public class program_Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit ob=new inherit();
		ob.display();

	}

}
