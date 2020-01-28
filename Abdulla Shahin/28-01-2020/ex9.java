import java.util.LinkedList;
import java.util.Iterator;
  public class ex9 {
  public static void main(String[] args)
  {
     LinkedList<Integer> l_list = new LinkedList<Integer>();
          l_list.add(204);
          l_list.add(403);
          l_list.add(101);
          l_list.add(901);
          l_list.add(666);
		  Iterator p = l_list.listIterator(2);
		  while (p.hasNext()) 
		  {
			  System.out.println(p.next());
		  }
   }

}