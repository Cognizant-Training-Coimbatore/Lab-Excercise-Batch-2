import java.util.Scanner;

class Programming{
	
	
	Programming() {
		System.out.println("i love programming languages");
	}
	
	Programming(String xyz) {
		
		System.out.println("i love " + xyz );
	}
}

public class program35_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pg_lang;
		Programming obj1 = new Programming();
		System.out.println("enter the language");
		   Scanner sc = new Scanner(System.in);
		   pg_lang = sc.nextLine();
		Programming obj2 = new Programming(pg_lang);
		
	}

}
