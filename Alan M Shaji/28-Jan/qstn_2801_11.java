import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class qstn_2801_11 {
	  public static void main(String[] args) {
	     LinkedList<String> linked_list = new LinkedList<String>();
          linked_list.add("Red");
          linked_list.add("Green");
          linked_list.add("Black");
          linked_list.add("Pink");
          linked_list.add("orange");
          System.out.println("Original linked list:" + linked_list);  
          System.out.println("Enetr the positions to be swapped");
          Scanner sc=new Scanner(System.in);
          int x=sc.nextInt();
          int y=sc.nextInt();
          String first_element = linked_list.get(x);
          linked_list.set(x,linked_list.get(y));
          linked_list.set(y,first_element);
          System.out.println("Original linked list:" + linked_list);  
          sc.close();
	    
	 }
	}