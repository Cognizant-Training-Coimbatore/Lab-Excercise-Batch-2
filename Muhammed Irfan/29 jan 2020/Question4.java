package demo_29_01_2020;
interface test
{
  void square(int x);	
}
class maths implements test
{
	public void square(int x)
	{
		System.out.println("area "+x*x);
	}
}
class totestint extends maths
{
   maths obj= new maths();
   totestint(int y)
   {
	   obj.square(y);
   }
}
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		totestint obj= new totestint();
		
	}

}
