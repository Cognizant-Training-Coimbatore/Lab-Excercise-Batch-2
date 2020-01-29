package newjava;
interface inheritance
{
	void meth1();
}
class inhert implements inheritance
{
	public void meth1()
	{
		System.out.println("inheritance");
	}
}
class vere implements inheritance
{
	public void meth1()
	{
		System.out.println("mm");
	}
}
public class q3 {

	public static void main(String[] args) {
	 
		inhert ob=new inhert();
		ob.meth1();
		vere ob2=new vere();
		ob2.meth1();
		

	}

}
