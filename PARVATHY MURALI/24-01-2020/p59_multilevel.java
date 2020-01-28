class n
{
	int a=90;
}
class m extends n
{
	int b=100;
}
class p extends m
{
	void disp()
	{
		System.out.println(a+b);
	}
}
public class p59_multilevel {

	public static void main(String[] args) {
		p ob=new p();
		ob.disp();

	}

}
