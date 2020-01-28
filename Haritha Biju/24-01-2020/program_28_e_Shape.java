package demo;
/*Create a class named 'Shape' with a method to print 
"This is This is shape". Then create two other classes named 'Rectangle',
 'Circle' inheriting the Shape class, both having a method to print "This is
  rectangular shape" and "This is circular shape" respectively. Create a subclass
   'Square' of 'Rectangle' having a method to print "Square is a rectangle".
    Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square'
     class.
 */
class Shape
{
	void print()
	{
		System.out.println("This is this is Shape");
	}
}
class Rectangle extends Shape
{
	void printR()
	{
		System.out.println("This is rectangular Shape");
	}
}
class Circle extends Shape
{
	void printC()
	{
		System.out.println("This is circular Shape");
	}
	
}
class Square extends Rectangle
{
	void printSq()
	{
		System.out.println("Square is a Rectangle");
	}
	
}
public class program_28_e_Shape 
{
	public static void main(String[] args)
	{
		Square sq=new Square();
		sq.print();
		sq.printR();
		
	}
	

}
