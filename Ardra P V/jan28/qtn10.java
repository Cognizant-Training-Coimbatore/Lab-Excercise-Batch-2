import java.util.LinkedList;

public class qtn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        System.out.println("Original linked list:" + al);  
        
        
         Object first_element = al.getFirst();
         System.out.println("First Element is: "+first_element);
      
        
         Object last_element = al.getLast();
         System.out.println("Last Element is: "+last_element);
      

	}

}
