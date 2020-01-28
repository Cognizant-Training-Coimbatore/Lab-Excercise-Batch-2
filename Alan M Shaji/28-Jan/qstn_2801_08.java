import java.util.ArrayList;
public class qstn_2801_08 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		
		colors.add("Green");
		
		colors.add("Orange");
		
		colors.add("Blue");
		
		colors.add("Black");
		
		colors.add("Yellow");
		int j=0;
		while(j<colors.size()) {
			System.out.println(colors.get(j));
			j++;
		}
}
}