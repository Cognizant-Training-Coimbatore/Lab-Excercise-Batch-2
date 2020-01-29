package abstract_123;
interface myinterface
{

	void add();
	default void compare()
	{
		System.out.println("compare");
	}
	int findgreatest(int x,int y);
	int x=7,y=9;
}
class nbv implements myinterface
{


@Override
public void add() {
	
	System.out.println(x+y);
}

@Override
public int findgreatest(int x, int y) {
	// TODO Auto-generated method stub
	if(x>y)
	{
		System.out.println(x);
	}
	else
	{
		System.out.println(y);
	}
	return 0;
}
}
public class interface_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nbv obj=new nbv();
obj.add();
obj.compare();
obj.findgreatest(10, 9);

	}

}
