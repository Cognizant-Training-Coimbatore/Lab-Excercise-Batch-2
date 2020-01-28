class sample6
{
	static int i;
	static void display()
	{
		i++;
		System.out.println(i);
		
	}
}
public class qu16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample6 obj1 = new sample6();
		obj1.display();
		sample6 obj2 = new sample6();
		obj2.display();
	}

}
