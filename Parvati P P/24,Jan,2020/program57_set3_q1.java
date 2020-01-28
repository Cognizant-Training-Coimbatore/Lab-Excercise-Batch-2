package Package2;
class a
{
	int x;
}
class b extends a
{
	int y;
	void Add(int x,int y)
	{
		System.out.println(x+y);
	}
}

public class program57_set3_q1 {

	public static void main(String[] args) {
b obj=new b();
obj.Add(10,20);

	}

}
