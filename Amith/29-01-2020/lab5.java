package exercises;
interface dis
{
	void display();
	
}
class outer implements dis
{
	static class inner 
	{

		
		public void display() {
			System.out.println("inner is running");
			
		}
		
	}
	@Override
	public void display() 
	{
		System.out.println("outer is running");
		
	}
	
}
public class lab5 {

	public static void main(String[] args) {
		outer obj =new outer();
		obj.display();
		outer.inner ob=new outer.inner();
		ob.display();
	}

}
