import java.util.Scanner;

public class pgm7_pos_neg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner s = new Scanner(System.in);
		  System.out.print("Enter a number : ");
		  r = s.nextInt();
		  if(r < 0)
			  System.out.print("Negetive number ");
		  else if(r>0)
			  System.out.print("Psitive number ");
		  else
			  System.out.print("Number is 0 : ");

	}

}
