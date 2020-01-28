class stat
{
	static int x=8;
	static int display()
	{
		return x++;
	}
}
public class qu6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stat ob= new stat();
		int b=ob.display();
		System.out.println(b);
		int c=ob.display();
		System.out.println(c);
		

	}

}
