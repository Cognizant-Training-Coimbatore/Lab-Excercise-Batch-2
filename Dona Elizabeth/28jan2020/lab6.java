import java.util.ArrayList;

public class lab6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Amith");
		al.add("Vijay");
		al.add("Binoy");
		al.add("adhil");
		System.out.println("size : "+al.size());
		al.ensureCapacity(15);
		System.out.println("Size of arralist increased");
	}

}
