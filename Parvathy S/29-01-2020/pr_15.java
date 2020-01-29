import java.util.TreeSet;

public class pr_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(1);
		myset.add(4);
		myset.add(8);
		myset.add(4);
		myset.add(9);
		System.out.println(myset);
		System.out.println("Elements strictly greater than or equal to 3"); 
		System.out.println(myset.ceiling(3));

	}

}
