package gokul;
class int_char
{
	void first(char n, int b)
	{
		
		char c=n;
		int x=b;
		System.out.println("The values are "+c+" "+x);
		
	}
	void second(int a, char b)
	{
		int x=a;
		char c=b;
		System.out.println("The values are "+x+" "+c);
	}
}
public class programming39_int_char {

	public static void main(String[] args) 
	{
      int_char ch=new int_char();
       ch.first('a',0);
       ch.second(0, 'b');
	}

}
