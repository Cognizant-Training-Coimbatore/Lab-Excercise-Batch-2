class print
{
	void z(int n, char c)
	{
		System.out.println("integer is " +n +"\n" +"character is " +c);
	}
	void z(char c, int n)
	{
		System.out.println("character is " +c +" integer is" +n);
	}
	
}
public class print_int_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print obj =new print();
	  obj.z(10, 'n');
	  obj.z('v', 20);

	}

}
