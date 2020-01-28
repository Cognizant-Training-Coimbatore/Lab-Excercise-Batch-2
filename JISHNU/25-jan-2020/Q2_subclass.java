package day4a;
import day4.Q2_superclass;
class Q2_subclass extends Q2_superclass
{
	
	void display()
	{
		Q2_subclass obj=new Q2_subclass();
		System.out.println(obj.a);
	}
	public static void main(String[] args) 
	{
		Q2_subclass obj2=new Q2_subclass();
		obj2.display();
	}
}
