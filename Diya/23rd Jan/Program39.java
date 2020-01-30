class intchar
{

	void abc(int a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	void abc(String b, int a)
	{
		System.out.println(b);
		System.out.println(a);
	}
}
public class Program39 {

	public static void main(String[] args) {
		intchar obj = new intchar();
		obj.abc(1,"dia");
		//obj.abc("diya",2);

	}

}
