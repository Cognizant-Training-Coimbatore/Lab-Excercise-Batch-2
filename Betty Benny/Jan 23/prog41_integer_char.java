class intchar
{
	int a;
	char b;
	void display(int x,char y)
	{
		a=x;
		b=y;
		System.out.println("entered number is " +a );
		System.out.println("entered character is " +b);
	}
	void display(char y,int x)
	{
		a=x;
		b=y;
		System.out.println("entered number is " +a );
		System.out.println("entered character is " +b);
		
	}
}
public class prog41_integer_char {

	public static void main(String[] args) {
		intchar obj=new intchar();
		obj.display(3, 'd');
		obj.display('d', 5);
		// TODO Auto-generated method stub

	}

}
