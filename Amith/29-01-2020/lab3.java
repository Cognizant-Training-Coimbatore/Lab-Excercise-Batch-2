package exercises;
interface B
{
	void display();
	
}
class one implements B
{

	@Override
	public void display() {
	System.out.println("first sub class");
		
	}
	
}
class two implements B
{

	@Override
	public void display() {
		System.out.println("second sub  class");
		
	}
	
}
class three implements B
{

	@Override
	public void display() {
		System.out.println("third class");
		
	}
	
}
public class lab3 {

	public static void main(String[] args) {
		two o=new two();
		one b=new one();
		three j=new three();
		b.display();
		o.display();
		j.display();

	}

}
