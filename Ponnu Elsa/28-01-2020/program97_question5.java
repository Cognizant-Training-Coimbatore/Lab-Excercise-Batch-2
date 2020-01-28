import java.util.ArrayList;

public class program97_question5  {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Parvathy");
		arr.add("Dona");
		arr.add("Ponnu");
		arr.add("PDP");
		System.out.println(arr);
		arr.set(1,"Kootharaz");
		System.out.println(arr.get(1));
		System.out.println("After updation : "+arr);
	}

}
