class s1
{
	int x=5;
}
class s2 extends s1
{
	int y=5;
	void display()
	{
		System.out.println(x+y);
	}
}
public class program_qn1b {

	public static void main(String[] args) {
		s2 obj=new s2();
		obj.display();
		// TODO Auto-generated method stub

	}

}
