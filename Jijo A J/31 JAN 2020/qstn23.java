import java.util.Scanner;

public class qstn23 {

 static char countChar(String str1) {
  int count[] = new int[256];
  int l = str1.length();
  for (int i = 0; i < l; i++)
   count[str1.charAt(i)]++;
  int max = -1;
  char result = ' ';

  for (int i = 0; i < l; i++) {
   if (max < count[str1.charAt(i)]) {
    max = count[str1.charAt(i)];
    result = str1.charAt(i);
   }
  }

  return result;
 }
 public static void main(String[] args) {
	 System.out.println("Enter the string");
	 Scanner sc=new Scanner(System.in);
  String str1 =sc.nextLine();
  System.out.println("The given string is: " + str1);
  System.out.println("Max occurring character in the given string is: " + countChar(str1));
 }
}
