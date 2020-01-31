import java.util.HashMap;
import java.util.Scanner;

public class program94_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Abhi");
		hm.put(2,"ponnu");
		hm.put(3,"chinnu");
		hm.put(4,"annu");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an opt between 1 and 4 : ");
		opt=sc.nextInt();
		String name=hm.get(opt);
		System.out.println("name : "+name);
	}

}
