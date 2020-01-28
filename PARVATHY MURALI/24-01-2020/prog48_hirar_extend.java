class x1
{
	int a=4;
}
class x2 extends x1
{
	int b=3;
	void display() 
	{
	System.out.println("class x2"+a+b);
	}

}
class x3 extends x1
{
	int c=3;
	void display() 
	{
	System.out.println("class x3"+a+c);
	}

}
class x4 extends x3
{
	int a=3;
	void display() 
	{
	System.out.println("class x4"+a+c);
	}

}
public class prog48_hirar_extend {

	public static void main(String[] args) {
		x2 ob=new x2();
		ob.display();
		x3 ob3=new x3();
		ob3.display();
		x4 ob4=new x4();
		ob4.display();
		

	}

}
