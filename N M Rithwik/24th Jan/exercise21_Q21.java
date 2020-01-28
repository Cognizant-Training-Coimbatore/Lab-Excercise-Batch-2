class a5
{
	int a = 10;
}
class b5 extends a5
{
	int b = 30;
	
}
class inherit extends b5
{
	void display()
	{
		System.out.println(a+b);
	}
}
public class exercise21_Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inherit obj = new inherit();
		obj.display();
	}

}
