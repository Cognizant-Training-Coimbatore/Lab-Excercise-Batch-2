interface Square
{
	int x = 10;
	void disparea();
}
interface car
{
	void disp();
}
interface Representative
{
	void display();
}
class detail implements Square, car ,Representative
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area : " + x);
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Lamborgini");
	}

	@Override
	public void disparea() {
		// TODO Auto-generated method stub
		System.out.println("Manoj");
	}
	
}
public class exercise29_Q3 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details obj = new details();
		obj.disp();
		obj.disparea();
		obj.display();
		
	}

}