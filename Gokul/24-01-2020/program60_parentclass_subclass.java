package gokul;
class pclass
{
	void display()
	{
		System.out.println("This is parent class");
	}
}
class sclass extends pclass
{
	void print()
	{
		System.out.println("This is child class");
	}
	
}
public class program60_parentclass_subclass {

	public static void main(String[] args)
	{
		pclass obj1=new pclass();
		obj1.display();
		sclass obj2=new sclass();
		obj2.print();
		obj2.display();
		

	}

}
