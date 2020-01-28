import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class question12_compare {

	public static void main(String[] args) 
	{
		Set<String> b1=new TreeSet<String>();
		
		b1.add("One");
		b1.add("Two");
		b1.add("Three");
		b1.add("Four");
		b1.add("One");
		b1.add("Five");
		System.out.println("Elements of set 1 "+b1);
		Set<String> b2=new TreeSet<String>();
		
		b2.add("One");
		b2.add("Two");
		b2.add("Three");
		b2.add("Seven");
	
		System.out.println("Element of set 2 "+b2);
		b1.retainAll(b2);
		System.out.println("The elements retained are"+ b1);
		
				
			
			
				
		

	}

}
