final class batch1
{
	int a=10;
	int b=90;
}
class batch2 extends batch1 // batch1 cannot be inherited by batch2 since batch1 class is having the keyword final
{
	void display()
	{
		System.out.println(a+b);
	}
}
public class program72_final_class {

	public static void main(String[] args) {
		
	}

}
