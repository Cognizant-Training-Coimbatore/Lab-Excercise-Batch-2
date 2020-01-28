package classworkB;
import classworkA.question1_class;
class print extends question1_class
{
	void display()
	{
	System.out.println(i);
	}
}
public class question1_call 
{
	

	public static void main(String[] args)
	{
		print obj=new print();
		obj.display();
	}

}
