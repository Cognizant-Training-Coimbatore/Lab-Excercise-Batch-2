class print{
int b,d;
char h,i;
void display(int c,char a) {
b=c;
h=a;
System.out.println("c : " +c);
System.out.println("a : " +a);
}
void display(char c,int a) {
d=a;
i=c;
System.out.println("c : " +c);
System.out.println("a : " +a);
}
}
public class Q9 {

public static void main(String[] args) {
// TODO Auto-generated method stub
print p=new print();
p.display(1, 'p');
p.display('q', 2);


}

}