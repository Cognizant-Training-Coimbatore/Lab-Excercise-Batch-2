class s1
{
	int a=2;
}
class s2 extends s1
{
	int b=4;
	
}
class s3 extends s2
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class programaftq2_multiple {

	public static void main(String[] args)
	{
		s3 obj=new s3();
		obj.display();

	}

}
