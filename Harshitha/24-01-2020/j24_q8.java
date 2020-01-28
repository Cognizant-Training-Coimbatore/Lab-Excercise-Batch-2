import java.util.Scanner;

public class j24_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char[] arrs = new char[5];
  arrs[0] ='a' ;
  arrs[1] ='e';
  arrs[2] ='i' ;
  arrs[3] ='o';
  arrs[4] ='u' ;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a string");
 String str = sc.next();
 int n=0;
 for(int i=0;i<str.length();i++) {
	 for(int j=0;j<5;j++) {
	 if(str.charAt(i)== arrs[j]) {
		 n++;
	 }
 }
 }
System.out.println("The number of vowels in the given string are : "+ n);

}
}
