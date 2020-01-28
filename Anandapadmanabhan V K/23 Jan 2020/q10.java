class areaa
{
	void square(int a)
	{
		int area=a*a;
		System.out.println(area);
	}
	void rectangle(int l, int b)
	{
		int area=l*b;
		System.out.println(area);
	}
}
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaa obj=new areaa();
		obj.square(3);
		obj.rectangle(3, 4);
	}

}
