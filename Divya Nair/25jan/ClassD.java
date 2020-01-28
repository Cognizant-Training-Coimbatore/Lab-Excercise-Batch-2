package packTwo;
import packOne.ClassA;
public class ClassD extends ClassA 
{
	void display()
	{
		System.out.println(y);
	}
	void check()
	{
		ClassA obj=new ClassA();
		System.out.println(obj.y);
	}
}

