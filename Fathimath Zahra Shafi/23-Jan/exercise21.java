class method
{
	int n;
	char c;
	
	void display(int n,char c)
	{
		System.out.println("integer : " +n);
		System.out.println("character: " +c);
	}
	
	void display(char c,int n)
	{
		System.out.println("integer : " +n);
		System.out.println("character: " +c);
	}
}
public class exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
method obj=new method();
obj.display(2,'d');
obj.display('d',2);

	}

}
