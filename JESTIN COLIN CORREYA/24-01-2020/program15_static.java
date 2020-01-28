package demo;
class sample
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
		
	}
}
public class program15_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sample obj1=new sample();
obj1.display();
sample obj2=new sample();
obj2.display();

	}

}
