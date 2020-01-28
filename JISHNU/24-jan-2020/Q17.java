package day3;
class Aa2
{
	static int i;
	static int b;
	Aa2(int d, int e)
	{
		i=d;
		b=e;
	}
	static void settle()
	{
		i++;
		b++;
		System.out.println("value of b "+b);
		
	}
	static int retrieve()
	{
		
		return i;
	}
}
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa2 obj=new Aa2(3,4);
		Aa2.settle();
		int c=Aa2.retrieve();
		System.out.println("value of a : "+c);
	}

}
