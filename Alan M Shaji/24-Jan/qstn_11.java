class a
{
	int x=23;
}
class b extends a
{
	int y=346;
	void display()
	{
		System.out.println("sum\t:\t"+(x+y));
	}
}
public class qstn_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj= new b();
		obj.display();
		

	}

}
