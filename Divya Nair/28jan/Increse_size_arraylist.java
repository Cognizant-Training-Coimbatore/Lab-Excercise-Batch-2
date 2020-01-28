import java.util.ArrayList;


public class Increse_size_arraylist {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> ob=new ArrayList<String>();
		System.out.println("The colors are:");
		ob.add("red");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println(ob);
		System.out.println("The size of the array :"+ob.size());
		ob.ensureCapacity(8);
		ob.add("violet");
		ob.add("maroon");
		ob.add("green");
		System.out.println(ob);
		System.out.println("The size of the array :"+ob.size());

	}

}
