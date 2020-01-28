import java.util.Iterator;
import java.util.LinkedList;

public class excercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Integer>list = new LinkedList<Integer>();
		  
		       list.add(100);
		       list.add(222);
		       list.add(333);
		       list.add(444);
		       list.add(555);
		   Iterator p = list.listIterator(1);
		   System.out.println("The list from position 2:");
		   while (p.hasNext()) {
		   System.out.println(p.next());
		   }
	}

}
