import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
  public class ex11
  {
	  public static void main(String[] args) 
	  {
	     LinkedList<String> l_list = new LinkedList<String>();
	     l_list.add("White");
	     l_list.add("Red");
	     l_list.add("Black");
	     l_list.add("Blue");
	     l_list.add("Cyan");
	     System.out.println("Original linked list:" + l_list);  
	     System.out.println("Enetr the positions to be swapped");
	     Scanner sc=new Scanner(System.in);
	     int x=sc.nextInt();
	     int y=sc.nextInt();
	     String first_element = l_list.get(x);
	     l_list.set(x,l_list.get(y));
	     l_list.set(y,first_element);
	     System.out.println("Swapped linked list:" + l_list);  
	  }

}