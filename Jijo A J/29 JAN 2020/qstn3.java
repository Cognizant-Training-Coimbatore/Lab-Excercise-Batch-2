interface D
{
	
	public void print();
	}
interface B
{
	public void print1(); 
	}
class c implements D,B
{
	public void print() {
		{
			System.out.println("A");
			
		}
	}
	public void print1() {
		{
			System.out.println("B");
			
		}
	}
	}
public class qstn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c xx=new c();
xx.print();
xx.print1();
	}

}
