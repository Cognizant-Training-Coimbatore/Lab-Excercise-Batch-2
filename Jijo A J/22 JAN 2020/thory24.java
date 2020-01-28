class one {
	void display()
	{
		System.out.println("this is class one");
	}
	
}
class two extends one{
	void display()
	{
		System.out.println("this is class two");
	}
}
public class thory24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two obj=new two();
obj.display();
	}

}
