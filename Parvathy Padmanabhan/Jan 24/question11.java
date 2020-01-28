class a
{
  int a=10;	
}
class b extends a
{
	int b=20;
}
class inherit extends b
{
	int sum()
	{
		int c=a+b;
		return c;
	}
}
public class question11 {

	public static void main(String[] args) {
		inherit obj= new inherit();
		System.out.println("Sum :" +obj.sum());

	}

}
