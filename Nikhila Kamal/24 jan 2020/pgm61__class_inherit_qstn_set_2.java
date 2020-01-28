class A

{
	int x=7;
}
class B extends A
{
	int b=6;
}
class inherit extends B
{
	int c=x+b;
	void display()
	{
		System.out.println(c);
	}
	
}
public class pgm61__class_inherit_qstn_set_2 {

	public static void main(String[] args) {
		inherit obj=new inherit();
		obj.display();

	}

}
