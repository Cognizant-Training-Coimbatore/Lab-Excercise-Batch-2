import java.util.Iterator;
import java.util.TreeSet;

public class date28_iter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String>myset=new TreeSet<String>();
myset.add("java");
myset.add("selenium");
myset.add("unix");
System.out.println(myset);
Iterator it1=myset.iterator();
System.out.println("using iterator object..");
while(it1.hasNext())
{
	Object obj=it1.next();
	System.out.println(obj);
}
System.out.println("using for loop");
for(Object obj:myset) {
	System.out.println(obj);
}
	}

}
