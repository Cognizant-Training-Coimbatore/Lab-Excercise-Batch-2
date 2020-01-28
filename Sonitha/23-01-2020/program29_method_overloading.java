class test2
{
	void display() 
	{
	 System.out.println("DIsplay method withoout argument");	
	}
	void display(int x)//same name different parameter
	{
		System.out.println("New display method");
	}
}
public class program29_method_overloading {

	public static void main(String[] args) {
		
    test2 obj = new test2();
    obj.display();
    obj.display(45);
	}

}
