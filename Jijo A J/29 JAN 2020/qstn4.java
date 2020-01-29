interface test
{
	public void square(int x);
	
	}
class arithmetic implements test
{
	public void square(int x)
	{
		System.out.println(x*x);
	}
	}
public class qstn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test xx=new arithmetic();
xx.square(5);
	}

}
