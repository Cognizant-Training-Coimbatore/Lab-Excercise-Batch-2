package demo;
class stat
{
	static int y;
	static void display() {
		y++;
		System.out.println(y);
	}
	
   }

public class ex3_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling variable :");
		System.out.println(stat.y);
		System.out.println("calling method :");
		
		stat.display();

	}

}
