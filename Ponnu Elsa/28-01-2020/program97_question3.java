import java.util.ArrayList;


public class program97_question3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ponnu");
		al.add("Dona");
		al.add("Parvathy");
		al.add(0,"kootharz");
		System.out.println("1st Element : "+al.get(0));
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
