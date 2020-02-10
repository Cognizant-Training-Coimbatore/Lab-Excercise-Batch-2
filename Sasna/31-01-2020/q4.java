import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		int len;
		System.out.println("enter the string to be reversed :");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		String store = original;
		len = original.length();
		
		for(int i = len-1; i >=0 ; i-- ) {
			reverse = reverse + original.charAt(i);
			
		}
		System.out.println("reverse :"+ reverse);
	
		if (reverse.equals(original)){
			System.out.println("pallindrome");
		}else {
			System.out.println("not pallindrome");
		
		}


}
}