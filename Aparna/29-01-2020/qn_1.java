package set_7;
interface abc
{
	 void printable();
}
class rectangle implements abc
{

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("rectangle");
	}}
	class  sportcar implements abc
	{

		@Override
		public void printable() {
			// TODO Auto-generated method stub
			System.out.println("sportcar");
		}}
		class manager implements abc
		{

			@Override
			public void printable() {
				// TODO Auto-generated method stub
				System.out.println("manager");
			}
		
	
}
public class qn_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle obj=new rectangle();
obj.printable();
sportcar obj1=new sportcar();
obj1.printable();
manager obj2=new manager();
obj2.printable();


	}

}
