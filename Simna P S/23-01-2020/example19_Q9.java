class print
{
	 void type(int a, char c)
	{
		System.out.println("Interger: "+a+" character: "+c);
	}
	 void type(char c, int a)
		{
			System.out.println( "character: "+c+" Interger: "+a);
		}
}
public class example19_Q9 
{

	public static void main(String[] args) 
	{
		print obj = new print();
		obj.type(2, 'c');
		obj.type('a', 5);

	}

}
