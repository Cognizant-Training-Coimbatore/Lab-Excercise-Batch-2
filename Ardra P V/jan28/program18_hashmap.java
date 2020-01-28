import java.util.HashMap;
import java.util.Scanner;

public class program18_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>(); 
		map1.put(1, "ardra");
		map1.put(2, "anusha");
		map1.put(3, "anakha");
		map1.put(4, "ameena");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter opt bt 1 and 6");
		opt=sc.nextInt();
		String cn=map1.get(opt);
		System.out.println(cn);
		map1.remove(5);

	}

}
