class red
{
	void parent()
	{
		System.out.println("This is parent");
	}	
}
class blue extends red
{
	void child()
	{
		System.out.println("This is child class");
	}
}
public class prog_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        red obj1 = new red();
        blue obj2 = new blue();
        obj1.parent();
        obj2.child();
        obj2.parent();
	}

}
