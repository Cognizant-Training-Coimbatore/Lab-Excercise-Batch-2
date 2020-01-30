interface test
{
	void square();

	void square(int a);
}

class arithmetic implements test
{

	@Override
	public void square(int a)
	{
		System.out.println("square: " + (a*a));
		
		
	}

	@Override
	public void square() {
		// TODO Auto-generated method stub
		
	}

	
	
}
class totestint
{
	arithmetic obj=new arithmetic();
	totestint(int b)
	{
		obj.square(b);
	}
	
	
}
public class pgm_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 totestint obj2=new  totestint(7);

	}

}
