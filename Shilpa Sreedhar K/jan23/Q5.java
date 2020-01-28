import java.util.Scanner;

class handler{
String str;
void assign() {
System.out.println("Enter a string");
Scanner scanner=new Scanner(System.in);
str=scanner.nextLine();
}
int length() {
return str.length();
}
String lower() {
return str.toLowerCase();
}
}
public class Q5 {

public static void main(String[] args) {
// TODO Auto-generated method stub
       
handler hd=new handler();
hd.assign();
System.out.println("Length of String is : " +hd.length());
System.out.println("Lowercase of string is : "+hd.lower());
}

}