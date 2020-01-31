import java.util.ArrayList;



public class prog101_arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> a1=new ArrayList<String>();
		a1.add("Betty");
		a1.add("Blessy");
		a1.add("Biniya");
		a1.add(1,"Ethan");
		System.out.println("An element at 2nd position: " +a1.get(2));
		for(String s:a1)
		{
			System.out.println(s);
			
		}
	}
}
