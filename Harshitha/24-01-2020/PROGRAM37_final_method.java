class onr{
	 void display()
	{
		System.out.println("Display1 is working");
	}
}
class two extends onr
{
	//cannot override because of the keyword "final"
	void display() {
		System.out.println("Display2 is working");
	}
}
public class PROGRAM37_final_method 
{

	public static void main(String[] args) 
	{
		
two ob = new two();
ob.display();

	}

}
