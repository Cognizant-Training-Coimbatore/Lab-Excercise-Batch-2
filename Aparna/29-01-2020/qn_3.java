package set_7;
interface b
{
	int x=8;
	int y=9;
}
interface cn
{
	void add();
	void sub();
}
class n implements b,cn
{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println(x+y);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(x-y);
	}
	
}
public class qn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
n obj=new n();
obj.add();
obj.sub();
	}

}
