class Addtwo
{
	int c;
	int add(int a,int b)
	{
		c=a+b;
		return c;
	}
}
public class JavaDemo
{
public static void main(String a[])
{
 Addtwo a1=new Addtwo();
 int d=a1.add(10,20);
 System.out.println("the addition of two num is "+d);
}
}