package demo;

class stats
{
	static int i;
	static void display()
	{
		i++;
		System.out.println(i);
	}
}
public class program_28_static1 
{

	public static void main(String[] args)
	{
		stats obj = new stats();
		System.out.println(stats.i);
		stats.display();
	}

}