package day3;
class t1
{
	int a=12;
}
class t2 extends t1
{
	int b=14;
}
class t3 extends t2
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t3 obj=new t3();
		obj.display();
	}

}
