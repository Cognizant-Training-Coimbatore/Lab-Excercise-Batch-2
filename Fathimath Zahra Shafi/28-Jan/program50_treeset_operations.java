import java.util.Iterator;
import java.util.TreeSet;

public class program50_treeset_operations {

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
Iterator itr=myset.iterator();
System.out.println("using iterator object...");
while(itr.hasNext())
{
	Object obj=itr.next();
	System.out.println(obj);
}

System.out.println("using for loop.......");
for(Object obj:myset)
{
	System.out.println(obj);
}



		

	}

}
