import java.util.ArrayList;

public class pro_111111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("ponnu");
		al.add("paru");
		al.add("dona");
		al.add("irfan");
		System.out.println("size : "+al.size());
		al.ensureCapacity(15);
		System.out.println("Size of arralist increased");

	}

}
