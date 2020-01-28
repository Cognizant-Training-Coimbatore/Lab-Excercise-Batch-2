import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class qtn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        Iterator p=al.listIterator(1);
        while(p.hasNext()) {
        	System.out.println(p.next());
        }

	}

}
