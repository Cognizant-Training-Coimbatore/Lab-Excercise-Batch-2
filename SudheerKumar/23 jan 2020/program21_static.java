class sample2
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class program21_static {

	public static void main(String[] args) {
		sample2 obj1=new sample2();
		obj1.display();
		sample2 obj2=new sample2();
		obj2.display();
		

	}

}
