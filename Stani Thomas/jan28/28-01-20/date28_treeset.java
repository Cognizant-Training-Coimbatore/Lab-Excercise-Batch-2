import java.util.Iterator;
import java.util.TreeSet;

public class date28_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String>myset=new TreeSet<String>();
myset.add("stani");
myset.add("jacky");
myset.add("abhijith");
myset.add("irfan");
System.out.println(myset);
Iterator iterator1=myset.iterator();
while(iterator1.hasNext())
{
	Object obj=iterator1.next();
	System.out.println(obj);
}
	}

}
