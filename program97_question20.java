import java.util.HashMap;

public class program97_question20  {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Parvathy");
		hm.put(2,"Ponnu");
		hm.put(3,"Dona");
		hm.put(4,"Annmary");
		hm.put(5,"Anna");
		int i=1;
		while(i<=3)
		{
			System.out.println(hm.get(i));
			i++;
		}
	}

}
