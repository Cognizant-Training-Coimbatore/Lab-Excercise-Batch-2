import java.util.HashSet;

//Write a Java program to compare two sets and retain 
//elements which are same on both sets.

public class program_Q12
{

	public static void main(String[] args)
	{
		HashSet<String>  mylist=new HashSet<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("The hashset 1:"+mylist);
		
		HashSet<String>  mylist2=new HashSet<String>();
		mylist2.add("Item1");
		mylist2.add("Item2");
		mylist2.add("Item3");
		mylist2.add("Item4");
		mylist2.add("Item5");
		System.out.println("The hashset 2:"+mylist2);
		mylist.retainAll(mylist2);
	    System.out.println("Same elements :"+mylist);
	}

}
