import java.util.Iterator;
import java.util.TreeSet;

public class date28_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer>myset = new TreeSet<Integer>();
		   TreeSet <Integer>myset1 = new TreeSet<Integer>();
		     
		   
		   myset.add(1);
		   myset.add(2);
		   myset.add(3);
		   myset.add(5);
		   myset.add(6);
		   myset.add(7);
		   myset.add(8);
		   myset.add(9);
		   myset.add(10);
		     
		   
		 myset1 = (TreeSet)myset.headSet(7);  

		   
		   Iterator iterator;
		   iterator = myset1.iterator();
		     
		  
		   System.out.println("myset1 data: ");     
		   while (iterator.hasNext()){
		   System.out.println(iterator.next());
		   }
	}

}
