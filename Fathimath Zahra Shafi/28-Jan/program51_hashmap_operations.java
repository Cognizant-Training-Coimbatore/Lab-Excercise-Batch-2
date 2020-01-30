import java.util.HashMap;
import java.util.Scanner;

public class program51_hashmap_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1,"Java");
		hashmap1.put(2,"C#");
		hashmap1.put(3,"Selenium");
		hashmap1.put(4,"Perl");
		hashmap1.put(5,"Cobol");
		hashmap1.put(6,"Fortran");
		int opt;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your option between 1 and 6");
		opt=scanner.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(5);
	}

}
