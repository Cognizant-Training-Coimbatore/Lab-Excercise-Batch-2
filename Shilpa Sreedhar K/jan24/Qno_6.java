class sample41
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class Qno_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample41 obj1=new sample41();
		obj1.display();
		sample41 obj2=new sample41();
		obj2.display();
	}

}