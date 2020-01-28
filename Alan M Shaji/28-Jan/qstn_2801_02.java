import java.util.ArrayList;
import java.util.Iterator;

public class qstn_2801_02 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		
		colors.add("Green");
		
		colors.add("Orange");
		
		colors.add("Blue");
		
		colors.add("Black");
		
		colors.add("Yellow");	
	
		Iterator it=colors.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
/*
		for(String s:colors)
			System.out.println(s);
*/
	}

	}