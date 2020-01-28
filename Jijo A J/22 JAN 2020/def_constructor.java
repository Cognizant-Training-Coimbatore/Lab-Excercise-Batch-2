class test1
{
	
	int x,y;
	void assign1(int a, int b)
	{
		x=a;
		y=b;
	}
	test1()
	{
		x=1;
		y=1;
	}
	test1(int a , int b)
	{
		x=a;
		y=b;
	}
	void display1()
	{
		System.out.println(x+y);
	}
	}
public class def_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test1 xx=new test1();
xx.display1();
xx.assign1(4, 5);
xx.display1();
test1 xxx=new test1(8,7);
xxx.display1();
	}

}
