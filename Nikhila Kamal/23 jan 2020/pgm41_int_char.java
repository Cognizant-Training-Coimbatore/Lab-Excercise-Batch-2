class print
{
	void display(int n,char c)
	{
		System.out.println(n);
		System.out.println(c);
	}
	void display(char c,int n)
	{
		System.out.println(c);
		System.out.println(n);
	}
}
public class pgm41_int_char {

	public static void main(String[] args) {
		
		print obj=new print();
		obj.display(4,'k');
		obj.display('k',4);
		
	}

}
