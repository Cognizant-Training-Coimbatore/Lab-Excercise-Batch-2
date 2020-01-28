import java.util.*;
public class example3hashset {
	public static void main(String args[])
	{
		Set<Integer> myset = new HashSet<Integer>();
		int p=0;
		for(int i=0; i<5;i++)
		{
			myset.add(p);
			p=p+10;
		}
		p=0;
		for(int i=0; i<5;i++)
		{
			myset.add(p);
			p=p+20;
			
		}
		System.out.println(myset);
	}
}
