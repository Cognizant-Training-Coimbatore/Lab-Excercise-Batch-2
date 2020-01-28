package day3;
class s1
{
	int a=3;
}
class s2 extends s1
{
	int b=5;
	void display()
	{
		System.out.println(a+b);
	}
}
class s3 extends s1
{
	int c=34;
	void display()
	{
		System.out.println(a+c);
	}
}
class s4 extends s1
{
	int d=122;
	void display()
	{
		System.out.println(a+d);
	}
}
public class hierarchical_inheritance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		s2 obj=new s2();
		s3 obj1=new s3();
		s4 obj2=new s4();
		obj.display();
		obj1.display();
		obj2.display();
	}

}
