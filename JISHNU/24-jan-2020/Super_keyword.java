package day3;
class a1
{
	int d=12;
}
class a2 extends a1
{
	int d=14;
	void display()
	{
		System.out.println(super.d);//use of super keyword
	}
}
public class Super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a2 obj=new a2();
		obj.display();
	}

}
