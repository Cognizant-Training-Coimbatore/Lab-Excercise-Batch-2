class area1
{
	void sqr(int s)
	{
		System.out.println(" area is  "+(s*s));
	}
	void rect(int l,int b)
	{
		System.out.println(" area is  "+(l*b));
	}
}
public class Question10 {

	public static void main(String[] args)
	{
		area1 obj = new area1();
		obj.sqr(3);
		obj.rect(3, 4);

	}

}
