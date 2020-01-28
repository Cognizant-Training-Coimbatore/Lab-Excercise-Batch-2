import java.util.Scanner;

class calc1
{
	int p,q,c;
	calc1(int a,int b)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter firstnum");
		p = s.nextInt();
		System.out.println("enter secondnum");
		q = s.nextInt();
	}
	void add()
	{
		c=p+q;
		System.out.println("sum is : " +c );	
	}
	void sub()
	{
		c=p-q;
		System.out.println("difference is : "+c);	
	}
	void multiple()
	{
		System.out.println("product is : " +p*q);	
	}
	void div()
	{
		System.out.println("quotient is : " +p/q);	
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc1 obj=new calc1(5,10);
		obj.add();
		obj.sub();
		obj.multiple();
		obj.div();
		
	}

}
