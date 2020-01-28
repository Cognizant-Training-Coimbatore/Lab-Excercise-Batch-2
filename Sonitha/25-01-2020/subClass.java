package j25_q1_subclass;
import j25_q1_protectedField.protectedField;
class subclas extends protectedField//through inheritance calling a protected field[x]
{
	int y=10;
	void display() 
	{
		System.out.println("the sum of the variable x and y are : "+(x+y));
	}
}
public class subClass 
{

	public static void main(String[] args) 
	{
    subclas ob =new subclas();
    ob.display();
	}

}
