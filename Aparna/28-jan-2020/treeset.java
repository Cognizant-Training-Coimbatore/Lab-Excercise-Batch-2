package collection;

import java.util.Iterator;
import java.util.TreeSet;



public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> myset=new TreeSet<String>();  //avoid duplicates,sort in ascending order
myset.add("aparna");
myset.add("albin");
myset.add("agnes");
myset.add("mariam");
System.out.println(myset);
Iterator iterator1=myset.iterator();
while(iterator1.hasNext())
{
	Object obj=iterator1.next();
	System.out.println(obj);
}


	}
}