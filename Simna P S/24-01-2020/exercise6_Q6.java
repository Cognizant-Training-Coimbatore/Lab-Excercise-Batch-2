class stat
{
	static int i;
	static void display()
	{
		i++;
		System.out.println(i);
	}
}
public class exercise6_Q6 {

	public static void main(String[] args) {
		stat obj = new stat();
		System.out.println(stat.i);
		stat.display();

	}

}
