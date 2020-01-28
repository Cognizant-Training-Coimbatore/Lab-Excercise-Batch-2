import java.util.Scanner;
import java.util.TreeMap;

public class Q20_keyy {

	public static void main(String[] args) {
	TreeMap <Integer,String> t1=new TreeMap();
	t1.put(12,"White");
	t1.put(26,"Orange");
	t1.put(45,"Green");
	t1.put(39,"Red");
	t1.put(45,"Blue");
	t1.put(73,"Violet");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int n=sc.nextInt();
System.out.println(t1.headMap(n));
	}

}
