import java.util.Scanner;

public class Ass8 {

public static void main(String[] args) {
// TODO Auto-generated method stub
int i,n;
int c=0;
String s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
s=sc.nextLine();
n=s.length();
for(i=0;i<n;i++)
{
char ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
c++;
}
System.out.println("Frequency="+c);
}

}

