class xxx
{
	 xxx(int n,char c)
	{
		System.out.println("hello number"+n+"Mr"+c);
	}
	 xxx(char c,int n)
	{
		System.out.println("Hello Mr"+c+"number"+n);
	}
}
public class programQ9 {

	public static void main(String[] args)
	{
		xxx obj1 = new xxx('A',2);
		xxx obj2 = new xxx(1,'B');
	

	}

}
