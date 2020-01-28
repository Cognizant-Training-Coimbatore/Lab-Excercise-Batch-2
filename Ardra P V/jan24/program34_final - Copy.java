class one{
	void display() {
		System.out.println("display is working");
	}
}
class two extends one{
	void display()
	{
		System.out.println("dis 2");
	}
}
public class program34_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two obj=new two();
		obj.display();

	}

}
