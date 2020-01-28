import java.util.HashMap;
import java.util.Scanner;

public class program_hash_map {

	public static void main(String[] args) {
		//hash map
				System.out.println("\n\n HashMap");
				HashMap<Integer,String> hmap=new HashMap<Integer,String>();
				hmap.put(1,"English");
				hmap.put(2,"Hindi");
				hmap.put(3,"Malayalam");
				hmap.put(4,"Tamil");
				int opt;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number from  1 to 6");
				opt=sc.nextInt();
				String Language=hmap.get(opt);
				System.out.println(Language);

				System.out.println(" Removing the entered option");
				hmap.remove(opt);
				System.out.println(hmap);
	}

}
