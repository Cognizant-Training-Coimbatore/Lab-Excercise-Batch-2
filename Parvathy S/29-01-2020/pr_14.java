import java.util.TreeSet;

public class pr_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(1);
		myset.add(7);
		myset.add(10);
		myset.add(3);
		myset.add(4);
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
