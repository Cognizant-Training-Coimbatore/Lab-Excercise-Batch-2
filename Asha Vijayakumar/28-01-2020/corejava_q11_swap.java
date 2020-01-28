import java.util.Collection;
		import java.util.Collections;
		import java.util.LinkedList;

public class corejava_q11_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				LinkedList<String> ob=new LinkedList<String>();
				
				ob.add("red");
				ob.add("blue");
				ob.add("white");
				ob.add("yellow");
				ob.add("pink");
				System.out.println("The list is:"+ob);
				Collections.swap(ob, 0, 3);
				System.out.println("The list after swapping is:"+ob);

			}

		


	}


