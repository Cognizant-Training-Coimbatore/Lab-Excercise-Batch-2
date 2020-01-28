import java.util.TreeSet;

//Write a Java program to add all the elements of a 
//specified tree set to another tree set. 
public class program_Q13 
{

	public static void main(String[] args) 
	{
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("1");
		myset.add("2");
		myset.add("3");
		myset.add("4");
		myset.add("5");
		
		System.out.println("Set 1 is"+myset);
		
		TreeSet<String> myset2=new TreeSet<String>();
		myset2.add("6");
		myset2.add("7");
		myset2.add("8");
		myset2.add("9");
		
		
		System.out.println("Set 2 is"+myset2);
		
		myset.addAll(myset2);
		
		System.out.println("Set 1 after adding set 2: "+myset);
		

	}

}
