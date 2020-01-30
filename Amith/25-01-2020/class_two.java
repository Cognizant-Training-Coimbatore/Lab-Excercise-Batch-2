package packageB;
import packageA.class_one;
public class class_two extends class_one
{
	 static void display()
	{
		System.out.println(y);
	}

	public static void main(String[] args) 
	{

		class_one obj = new class_one();
		obj.print();
		System.out.println("name : "+obj.name+"  address :"+obj.adress+" department :"+obj.dep+" salary :"+obj.sal);
		
	}

}
