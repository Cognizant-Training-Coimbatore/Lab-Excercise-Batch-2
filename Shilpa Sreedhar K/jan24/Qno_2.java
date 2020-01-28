class t11
{
	int a;
}
class t12 
{
	int b=5;
}
class t13 extends t11, t12
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class pgm25_multilevel_inheritnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t13 obj=new t13();
		obj.display();
		

	}

}
