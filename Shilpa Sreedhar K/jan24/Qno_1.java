class ci
{
	int x=5;
}
class cii extends ci
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class Qno_1 {

	public static void main(String[] args) {
		cii obj=new cii();
		obj.display();

	}

}