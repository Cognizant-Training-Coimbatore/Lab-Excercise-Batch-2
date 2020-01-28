import java.util.TreeSet;

public class prog120_ex14_number_less7 {

	public static void main(String[] args) {
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(1);
		myset.add(9);
		myset.add(7);
		myset.add(3);
		myset.add(2);
		System.out.println(myset);
		System.out.println("Elements less than 7 in the tree set are "); 
		for(int x:myset)
		{
			if(x<7)
			{
				System.out.println(x);
			}
		}
		
	}

}
