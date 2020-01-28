class XYZ
{
	static int a=123;
	static void display()
	{
		System.out.println(a++);
	}
}
public class qstn_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ obj=new XYZ();
		System.out.print("calling Static method\t:\t");
		XYZ.display();
		System.out.println("calling variable\t:\t"+XYZ.a);
		
	}

}
