class Sequence
{
	int a,b,c;
	char d;
	
	public void method1(int p, int q)
	{
		a=p;
		b=q;
		System.out.println("The integers are "+a+"and "+b);
	}
	public void method2(int r, char s)
	{
		c=r;
		d=s;
		
		System.out.println("The integers are "+c+"and "+d);
	}
	
}
public class program39_Question9 {

	public static void main(String[] args) {

		Sequence sq=new Sequence();
		sq.method1(10,20);
		sq.method2(100,'P');
		
		
	}

}
