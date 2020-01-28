class t1
{
	int a=2;
}
class t2 extends t1
{
	int b=5;
}
class t3 extends t2
{
	int c=a+b;
	void display()
	{
		  System.out.println(c);
	}
}
public class mul_ {

	public static void main(String[] args) {
		t3 ob=new t3();
		ob.display();

	}

}
