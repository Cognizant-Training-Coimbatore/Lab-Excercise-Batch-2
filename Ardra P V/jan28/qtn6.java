import java.util.ArrayList;

public class qtn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>(10);
		for(int i=0;i<=10;i++) {
	       numbers.add(i);}
		for(int s:numbers) {
        	System.out.println(s);
		
	}
	       numbers.ensureCapacity(15);
	       for(int i=0;i<=15;i++) {
		       numbers.add(i);}
			for(int s:numbers) {
	        	System.out.println(s);
			
		}
	}

}
