package demo;
/*Question 3
Create a class with a method that prints "This is parent class" and its 
subclass with another method that prints "This is child class". Now, create 
an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
*/
class parent
{
	void displayparent()
	{
		System.out.println("This is parent class");
	}
}

class child extends parent //single inheritence
{
	void displaychild()
	{
		System.out.println("This is child class");
	}
}

public class program_28_c_parent_child
{

	public static void main(String[] args)
	{
		parent p=new parent();
		child c=new child();
		p.displayparent();
		c.displaychild();
		c.displayparent();

	}

}
