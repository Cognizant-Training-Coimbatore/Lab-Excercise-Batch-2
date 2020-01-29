interface Rectangle
{
	int x = 10, y = 20;
	void disparea();
}
interface Sportscar
{
	void disp();
}
interface Manager
{
	void display();
}
class details implements Rectangle, Sportscar , Manager
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area : " + x*y);
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
public class exercise29_Q1 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details obj = new details();
		obj.disp();
		obj.disparea();
		obj.display();
		
	}

}
