class area1
{
	void rect(int l, int b)
	{
		int c= l*b;
		System.out.println("Area of the rectangle is "+c);
	}
	void rect(int a)
	{
		int n =a*a;
		System.out.println("Area of the square is "+n);
	}
}
public class Program40 {

	public static void main(String[] args) {
		area1 obj = new area1();
		obj.rect(2,3);
		obj.rect(2);

	}

}
