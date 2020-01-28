package package2;
class a
{
	int a=8;
}
class b extends a
{
	int b=9;
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class qn1_set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b obj=new b();
obj.display();
	}

}
