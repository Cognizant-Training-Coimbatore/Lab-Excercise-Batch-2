import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"Divya");
		map1.put(2,"Diya");
		map1.put(3,"Bindu");
		int opt;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr your opyion betwwen 1-3");
		opt=scan.nextInt();
		String Name= map1.get(opt);
		System.out.println(Name);
		map1.remove(2);
		
	}

}
