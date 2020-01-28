package demo;
class charint
{
	void charint1(int a,char b)
	{
		System.out.println(a+"\n"+b);
	}
	void charint1(char e,int f)
	{
		System.out.println(e+"\n"+f);
	}
	
}

public class q9_charint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
charint obj=new charint();
obj.charint1(1, 'f');
obj.charint1('e', 3);

	}

}
