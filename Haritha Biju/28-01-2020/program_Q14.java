import java.util.TreeSet;
//-Write a Java program to find the numbers less than 7 in a tree set.  
public class program_Q14
{

	public static void main(String[] args)
	{
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(51);
		myset.add(10);
		myset.add(2);
		myset.add(43);
		myset.add(15);
		myset.add(14);
		myset.add(6);
		System.out.println(myset);
		System.out.println("No less than 7 are:");
		for(int x:myset)
		{
			if(x<7)
			{
				System.out.print(x+", ");
			}
		}

	}

}
