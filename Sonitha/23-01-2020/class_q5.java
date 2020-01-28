import java.util.Scanner;

class twomethods{
	

	int  length(String st) {
		int len = st.length();
		return len;
		
	}
	public void lowercase(String st) {
		System.out.println(st.toLowerCase());
	}
}
public class class_q5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = sc.next();
	twomethods ob = new twomethods();
	System.out.println("The length of the string is :"+ ob.length(s) );
	ob.lowercase(s);

	}

}
