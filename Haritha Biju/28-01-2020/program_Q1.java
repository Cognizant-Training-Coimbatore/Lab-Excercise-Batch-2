import java.util.ArrayList;

//Write a Java program to create a new array list, 
//add some colors (string) and print out the collection. 
public class program_Q1 
{ 	
	public static void main(String[] args) 
	{			
				ArrayList list=new ArrayList();
				list.add("Red");
				list.add("White");
				list.add("Black");
				list.add("Yellow");
				for(Object obj:list)
					System.out.println(obj);
	}


}
