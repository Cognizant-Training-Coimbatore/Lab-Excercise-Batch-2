class a11
{
	int n=2;
	
}
class a22 extends a11
{
	int n=3;
	void display()
	{
		System.out.println(n);// here a22 overrides the n value of a11
		System.out.println(super.n);// upon using super keyword, value on n in a11 can be retained
	}
}


public class program49_super_keyword {

	public static void main(String[] args) {
		a22 obj=new a22();
		obj.display();
	}

}
