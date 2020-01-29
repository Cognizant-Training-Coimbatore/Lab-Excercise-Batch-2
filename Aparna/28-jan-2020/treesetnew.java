package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> myset=new TreeSet<String>();
myset.add("java");
myset.add("selenium");
myset.add("c++");
myset.add("perl");
myset.add("unix");
myset.add("ada");
myset.add("java");
System.out.println(myset);
Iterator it1=myset.iterator();
System.out.println("using iterator object");
while(it1.hasNext())
{
	Object ob=it1.next();
	System.out.println(ob);
}
System.out.println("using the loop");
for(Object ob:myset)
{
	System.out.println(ob);
}

	}

}
