class stati
{
	static int x;
	static void display()
	{
		x++;
		System.out.println(x);
	}
}
public class ex2_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling variable: ");
		System.out.println(stati.x);
		System.out.println("calling method: ");
		stati.display();

	}

}
