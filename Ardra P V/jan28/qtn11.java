import java.util.Collections;
import java.util.LinkedList;

public class qtn11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        al.add("manu");
        al.add("dev");
        System.out.println("Original linked list:" + al); 
        Collections.swap(al,0,2);
        System.out.println("New linked list after swap is " +al);
        

	}

}
