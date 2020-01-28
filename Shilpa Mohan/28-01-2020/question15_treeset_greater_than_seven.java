import java.util.Iterator;
import java.util.TreeSet;

public class question15_treeset_greater_than_seven {

	public static void main(String[] args) {
		
		TreeSet<Integer> myset = new TreeSet<Integer>();
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(4);
		myset.add(5);
		myset.add(6);
		myset.add(7);
		myset.add(8);
		myset.add(9);
		myset.add(10);
		
	TreeSet<Integer> tailset = new TreeSet<Integer>();
	tailset=(TreeSet<Integer>)myset.tailSet(7);
	
	Iterator iterate; 
    iterate = tailset.iterator(); 
    
    System.out.println("The resultant values less than seven: ");
    while (iterate.hasNext()) { 
        System.out.println(iterate.next() + " ");

		

	}

}
}
