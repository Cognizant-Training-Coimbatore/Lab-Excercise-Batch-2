class print
{
	int a;
	char b;
	void order1(int n,char c)
	{
		System.out.print(n);
		System.out.println(c);
	}
	void order2(char c,int n)
	{
		System.out.print(c);
		System.out.println(n);
	}
}

public class program39_work9 {

	public static void main(String[] args) {
		print obj=new print();
		obj.order1(2,'e');
		obj.order2('d',3);
	}

}
