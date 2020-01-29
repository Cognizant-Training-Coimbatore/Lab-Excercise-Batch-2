interface Printable
{
          public void print();
}
class Rectangle implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("rectangle");
	}
	
	}

class SportCar implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("sportcar");
	}
	
	}
class manager implements Printable
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("manager");
	}
	
	}

public class qstn1
{
          public static void main(String args[])
          {
                   Printable vec[] = {new Rectangle(), new SportCar(),
                                                new manager(),};
                   for(int index=0; index<vec.length; index++)
                   {
                             vec[index].print();
                   }
          }
}