class par{
void display() {
System.out.println("This is parent class");
}}
class chi extends par{
void dis() {
System.out.println("This is child class");
}
}
public class program_qn3b {

public static void main(String[] args) {
// TODO Auto-generated method stub
par obj1=new par(); 
chi obj=new chi();
obj1.display();
obj.dis();
obj.display();

}
}