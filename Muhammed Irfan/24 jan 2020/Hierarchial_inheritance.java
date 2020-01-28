package demo;
class x1
{
int x=5;	
}
class x2 extends x1
{
int y=5;	
void display()
  {
	System.out.println(x+y);
  }
}
class x3 extends x1
{
int z=10;	
void display()
{
	System.out.println(x+z);
}
}
class x4 extends x1
{
int p=23;	
void display()
{
	System.out.println(x+p);
}
}
public class Hierarchial_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		x2 obj1=new x2();
		obj1.display();
		x3 obj2=new x3();
		obj2.display();
		x4 obj3=new x4();
		obj3.display();
	}

}
