package package2;
class one
{
	final void display()   //final cannnot be overrided
	{
		System.out.println("display 1 is working");
	}
}
class two extends one
{
	void display() {
		System.out.println("display 2 is working");
	}
}
public class final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two obj=new two();
obj.display();
	}

}
