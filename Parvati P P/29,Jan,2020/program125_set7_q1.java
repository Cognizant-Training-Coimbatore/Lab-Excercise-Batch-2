package Package4;

interface Printable
{
	public void print(String x ,String y);
}
class Rectangle implements Printable
{

@Override
public void print(String a,String b) {
	// TODO Auto-generated method stub
	System.out.println(a+" "+b);
}
	
}

class SportCar implements Printable
{
	public void print(String a,String b) {
		// TODO Auto-generated method stub
		System.out.println(a+" "+b);
	}

}

class Manager implements Printable
{public void print(String a,String b) {
	// TODO Auto-generated method stub
	System.out.println(a+" "+b);
}

	
}

public class program125_set7_q1 {

	public static void main(String[] args) {
		Printable ob = new Rectangle();
		ob.print("2","1");
		Printable ob1 = new Rectangle();
		ob.print("Fiat","123");
		Printable ob2 = new Rectangle();
		ob.print("Mnam","1224");
 
  }
	}






