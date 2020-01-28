import java.util.ArrayList;

public class p104_position_array {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<String>();
		
		ob.add("red");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println("The elements are"+ob);
		int len=ob.size();
		System.out.println("The elements at specific position:");
		for(int i=0;i<len;i++)
		{
			System.out.println(ob.get(i));
		}

	}

}
