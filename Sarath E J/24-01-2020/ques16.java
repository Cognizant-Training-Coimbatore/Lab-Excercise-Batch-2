class stat
{
	static int y;
	static void display()
	{
		y++;
		System.out.println(y);
	}
}
public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("calling variable\t:\t");
		System.out.println(stat.y);
		System.out.print("calling Static method\t:\t");
		stat.display();


	}

}
