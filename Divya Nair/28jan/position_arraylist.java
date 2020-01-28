import java.util.ArrayList;

public class position_arraylist {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
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
