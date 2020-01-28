package demo;

class sample2
{
 static int i;
 void display()

{
	 i++;
	 System.out.println(i);
}
 
}
public class Static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sample2 obj1=new sample2();
		obj1.display();
		
		sample2 obj2=new sample2();
		obj2.display();
	}

}
