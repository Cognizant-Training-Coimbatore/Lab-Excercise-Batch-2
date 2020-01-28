final class batch1
{
	int a,b;
}
class batch2 extends batch1
{
	int c,d;
}
public class final_with_class {

	public static void main(String[] args) 
	{
		batch2 obj = new batch2();
		obj.c=2;

	}

}
