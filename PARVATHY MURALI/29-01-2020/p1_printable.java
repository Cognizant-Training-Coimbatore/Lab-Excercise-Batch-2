package packone;
interface printable
{
	void display();
}
class rec implements printable
{

	@Override
	public void display() {
		System.out.println("class rectangle......using printable");
		
	}
	
}
class sc implements printable
{

	@Override
	public void display() {
		System.out.println("class sportCar......using printable");
		
	}
}
	
	class mang implements printable
	{

		@Override
		public void display() {
			System.out.println("class Manager......using printable");
			
		}
	}
		
public class p1_printable {

	public static void main(String args[]) 
	{
		rec b=new rec();
		b.display();
		sc ob=new sc();
		ob.display();
		mang obj=new mang();
		obj.display();

	}

}
