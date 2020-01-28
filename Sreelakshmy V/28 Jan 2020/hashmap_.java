import java.util.HashMap;
import java.util.Scanner;

public class hashmap_ {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
	hashmap1.put(1,"java");
	hashmap1.put(2,"c#");
	hashmap1.put(3,"selennium");
	hashmap1.put(4,"Perl");
	hashmap1.put(5,"cobol");
	hashmap1.put(6,"Fortan");
	int opt;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your option between 1 to 6");
	opt=sc.nextInt();
	String coursename=hashmap1.get(opt);
	System.out.println(coursename);
	hashmap1.remove(5);
	}

}
