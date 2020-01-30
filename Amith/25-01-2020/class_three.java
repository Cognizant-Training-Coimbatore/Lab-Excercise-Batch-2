package packageB;
import packageA.class_one;
public class class_three extends class_one
{
	protected class_three()
	{
		class_one obj= new class_one();
		System.out.println(obj.x);
	}

	public static void main(String[] args) 
	{
	
		class_three obj= new class_three();
		
	}

}
