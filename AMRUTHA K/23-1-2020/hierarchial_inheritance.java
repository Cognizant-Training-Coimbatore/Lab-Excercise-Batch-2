package demo;
class p1{
	int a=2;
}
class p2 extends p1{
	int b=3;
	void display()
	{
		System.out.println(a+b);
	}
}
class p3 extends p1{
	int c=7;
	void display()
	{
		System.out.println(a+c);
	}
	
}
class p4 extends p1{
	int d=10;
	void display()
	{
		System.out.println(a+d);
	}
	
}
public class hierarchial_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 b=new p2();
		p3 b2=new p3();
		p4 b3=new p4();
		b.display();
		b2.display();
		b3.display();

	}

}
