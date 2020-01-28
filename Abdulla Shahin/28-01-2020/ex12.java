import java.util.*;
public class ex12 {
public static void main(String[] args)
{
	HashSet<String> h_set1 = new HashSet<String>();
    h_set1.add("White");
    h_set1.add("Blue");
    h_set1.add("Black");
    h_set1.add("White");
    System.out.println("Frist HashSet content: "+h_set1);
    HashSet<String>h_set2 = new HashSet<String>();
    h_set2.add("Red");
    h_set2.add("Pink");
    h_set2.add("Blue");
    h_set2.add("White");
    System.out.println("Second HashSet content: "+h_set2);
    h_set1.retainAll(h_set2);
    System.out.println("HashSet content:");
    System.out.println(h_set1);
}

}