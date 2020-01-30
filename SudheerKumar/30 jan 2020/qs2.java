package apache;
import apache.qs2;
import apache.myclass1;
public interface qs2{
	public void meth1();
	public void meth2();
	int x=5;
	int y=10;
}
class myclass1 implements qs2
{

	public void meth1()
	{
		System.out.println("meth1 implemented");
	}
	public void meth2()
	{
		System.out.println("meth2 implemented");
	}
       public static void main(String[] args) {
    	   qs2 obj=new qs2();
    	   obj.meth1();
    	   obj.meth2();
		// TODO Auto-generated method stub

	}

}
