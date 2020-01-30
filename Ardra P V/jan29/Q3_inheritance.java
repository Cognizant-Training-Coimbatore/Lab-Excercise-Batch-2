package apache;
interface ab
{
	int x=10;
}
interface bc
{
	int y=12;
}

public class Q3_inheritance 
 implements ab,bc
{
	void print()
	{
		System.out.println(x+" "+y);
	}
}



	