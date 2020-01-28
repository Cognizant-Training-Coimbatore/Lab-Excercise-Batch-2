package Tuesday;

import java.util.Set;
import java.util.HashSet;
public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> myset=new HashSet<String>();
myset.add("one");
myset.add("two");
myset.add("three");
myset.add("one");
myset.add("four");
System.out.println(myset);
for (String x:myset)
{
 System.out.println(x);	
}
	
	
	
	}

}
