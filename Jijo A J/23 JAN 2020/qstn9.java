class Programming1
{
	
	Programming1()
	{
		System.out.println("I love Programming languages");
		
		
	}
	Programming1(String a, int b)
	{
		System.out.println("I love "+b+a);
		
		
	}
	Programming1( int b,String a)
	{
		System.out.println("I love "+b+a);
		
		
	}
}
public class qstn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming1 xx=new Programming1();
		Programming1 xxx=new Programming1("MESSI",99);
		Programming1 xxxx=new Programming1(99,"MESSI");
	}

}

