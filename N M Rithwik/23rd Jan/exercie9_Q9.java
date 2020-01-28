class type
{
	void print(int a , char b)
	{
		System.out.println("Integer : " + a + " Character : " + b);
	}
	void print(char a , int b)
	{
		System.out.println("Character : " + a + " Integer : " + b);
	}
}
public class exercie9_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		type obj1 = new type();
		obj1.print('x',10);
		obj1.print(5,'r');
	}

}
