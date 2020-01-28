package demo;
/*Create class named as ‘a’ and create a sub class ‘b’.
 *  Which is extends from class ‘a’. And use these classes in ‘inherit’ class.
 */
class a
{
	int a=2;
	void display()
	{
		System.out.println(a);
	}
	
}
class b extends a
{
	int b=3;
	void display()
	{
		System.out.println(a+b);
		
	}
}
class inherit extends b  //multilevel inheritence
{	
	int c=4;
	void display()
	{
		System.out.println(a+b+c);
	}
public class program_28_1_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a ob1=new a();
		b ob2=new b();
		inherit ob3=new inherit();
		ob1.display();
		ob2.display();
		ob3.display();
	}

}
