import java.util.Iterator;
import java.util.TreeSet;

public class program13_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> myset=new TreeSet<String>();
   myset.add("ardra");
   myset.add("anakha");
   myset.add("anusha");
   myset.add("ananya");
   System.out.println(myset);
   
   
   Iterator itrator1=myset.iterator();
   while(itrator1.hasNext()) {
	   Object obj=itrator1.next();
	   System.out.println(obj);
   }
	}

}
