class intchar
{
	int a;
	char b;
	
	void display(int n,char c)
	{
		
		a=n;
		b=c;
		System.out.println("The entered character is "+b);
		System.out.println("The entered number is "+a);
	}
	void display(char c,int n)
	{
		
		b=c;
		a=n;
		System.out.println("The entered character is "+b);
		System.out.println("The entered number is "+a);
		
	}
}
public class prog41_int_char {

	public static void main(String[] args) 
	{
		intchar obj=new intchar();
		obj.display(3, 'a');
		obj.display('b',4);
		// TODO Auto-generated method stub

	}

}
