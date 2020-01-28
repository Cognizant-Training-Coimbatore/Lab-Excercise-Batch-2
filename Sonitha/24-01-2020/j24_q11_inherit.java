import java.util.Scanner;

class a2{
	int x=5;
}
class b2 extends a2{
	int y=4;
	void display() {
		System.out.println("The sum is :"+ (x+y));
	}
	
}

public class j24_q11_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		b2 ob = new b2();
		ob.display();

	}

}
