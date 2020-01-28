class t1
{
	int a=2;
}

class t2 extends t1
{
	int b=7;
}

class t3 extends t2
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class program37_multilevel_inheritance {

	public static void main(String[] args) 
	{
		t3 obj=new t3();
		obj.display();

	}

}
