import java.util.Scanner;

public class pgm_3 {

	public static void main(String[] args) {
		System.out.println("enter the side of hexagon");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	
	double area=(6*s*s)/(4*(Math.tan(3.14/6)));
	System.out.println(area);

	}
}

	

