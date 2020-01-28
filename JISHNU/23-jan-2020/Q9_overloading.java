package Jishnu;
class intchar
{
	void print(char a, int b)
	{
		System.out.println("Charcter: "+a+" Integer "+b);
	}
	void print(int b, char a)
	{
		System.out.println("Charcter: "+a+" Integer "+b);
	}
	
}
public class Q9_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intchar obj=new intchar();
		obj.print('J', 45);
		obj.print(12, 'J');
	}

}
