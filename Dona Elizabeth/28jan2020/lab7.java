import java.util.ArrayList;

public class lab7 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Amith");
		al.add("Vijay");
		al.add("Binoy");
		al.add("adhil");
		System.out.println(al);
		al.set(1,"jeni");
		System.out.println("After updation : "+al);
	}

}
