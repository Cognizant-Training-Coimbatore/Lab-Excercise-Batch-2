import java.util.HashMap;

public class lab20 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Abhi");
		hm.put(2,"ponnu");
		hm.put(3,"chinnu");
		hm.put(4,"annu");
		hm.put(5,"manu");
		int i=1;
		while(i<=3)
		{
			System.out.println(hm.get(i));
			i++;
		}
	}

}
