class integer
{	int n;
	char c;
	void first(int a,char b)
	{
		n=a;
		c=b;
		System.out.println("Display the number:" + n);
		System.out.println("Display the name:" + c);
	}
	void first(char a,int b)
	{
		n=b;
		c=a;
		System.out.println("Display the name:" + c );
		System.out.println("Display the number:" + n );
		
	}
}
public class program51_reversedatatype 
{

	public static void main(String[] args) 
	{
		integer obj = new integer();
		obj.first(4,'H');
		obj.first('H',3);
		// TODO Auto-generated method stub

	}

}
