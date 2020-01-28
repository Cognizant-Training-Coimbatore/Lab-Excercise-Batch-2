import java.util.ArrayList;

public class program97_question6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Parvathy");
		al.add("Dona");
		al.add("Ponnu");
		al.add("pdp");
		System.out.println("size : "+al.size());
		al.ensureCapacity(15);
		System.out.println("Size of array list increased");
	}

}
