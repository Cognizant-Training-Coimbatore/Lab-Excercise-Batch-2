import java.util.LinkedList;

public class a1_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> l_list = new LinkedList<String>();
		   
		          l_list.add("Red");
		          l_list.add("Green");
		          l_list.add("Black");
		     System.out.println("Original linked list:" + l_list);    
		   
		    l_list.addFirst("White");
		 
		   
		    l_list.addLast("Pink");
		     System.out.println("Final linked list:" + l_list);
	}

}
