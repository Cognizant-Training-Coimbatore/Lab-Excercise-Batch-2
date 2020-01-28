import java.util.Iterator;
import java.util.TreeSet;

public class program5_treeset1 {

	public static void main(String[] args) {
	TreeSet<String> myset=new TreeSet<String>();
	myset.add("Anjana");
	myset.add("Anu");
	myset.add("Nandhu");
	myset.add("Ann");
	System.out.println(myset);
Iterator<String> iterator1=myset.iterator();
while(iterator1.hasNext())
	
{
	Object obj=iterator1.next();
	System.out.println(obj);
}
	}

}
