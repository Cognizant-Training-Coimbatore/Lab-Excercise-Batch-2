import java.util.Scanner;

class gparent{
	int x=1;
}

class cl1 extends gparent{
	int y=2;
	x++;
void display1() {
		System.out.println("The sum of x and y : "+(x+y));
	}
			
}
class cl2 extends gparent{
	int z=3;
	x--;
	void display2() {
		System.out.println("The sum of x and z : "+(z+x));
	}
}
public class j24_q12_multiple_inheritance extends cl1,cl2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiple Inheritance"+(x+y+z));//Java wont support multiple inheritance
		System.out.println(x);

	}

}
