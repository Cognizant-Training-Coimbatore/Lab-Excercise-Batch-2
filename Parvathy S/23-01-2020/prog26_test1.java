class tes
{
	int a,b;
	void assign(int x,int y)
	{
		a=x;
	    b=y;
	}
	tes()
	{
		a=10;
		b=30;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class prog26_test1 {

	public static void main(String[] args) {
		tes obj=new tes();
		obj.assign(10,10);
		obj.display();

	}

}
