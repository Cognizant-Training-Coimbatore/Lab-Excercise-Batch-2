import java.util.ArrayList;

public class practice_Q6 
{

	public static void main(String[] args) 
	{
		ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        
        c1.ensureCapacity(6);
        c1.add("simna");
        c1.add("haritha");
        c1.add("rithwik");
        System.out.println("New array list: " + c1);

	}

}
