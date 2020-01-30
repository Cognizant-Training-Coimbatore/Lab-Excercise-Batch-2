class sample4
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class pgm44_static_varble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample4 obj=new sample4();
		obj.display();
		sample4 obj1=new sample4();
		obj1.display();
	}

}
