class a111
{
	String str="Hello";
}
class a21 extends a111
{
	String str1=" World";
}
class a31 extends a21
{
	void display()
	{
		System.out.println(str.concat(str1));
	}
}
public class program61_lab12_egof_multipleinheritance {

	public static void main(String[] args) {
		a31 obj=new a31();
		obj.display();
	}

}
