class member
{
int age;
double salr;
String address,name,phn;
void printsalary()
{
System.out.println("Salary=" +salr);

}
}
class employee extends member
{
String sep,dep;
}
class manager extends member
{
String sep1,dep1;
}
public class question14_member {

public static void main(String[] args) {
employee ob1=new employee();
manager ob2=new manager();
ob1.name="Sree";
ob1.phn="957788888";
ob1.age=22;
ob1.salr=56777.98;
ob1.address="Dagajsisskm";
ob2.name="Sasna";
ob2.phn="967887998";
ob2.age=20;
ob2.salr=99777.98;
ob2.address="agajsisskm";
System.out.println(ob1.name);
System.out.println(ob1.phn);
System.out.println(ob1.age);
System.out.println(ob1.salr);
System.out.println(ob1.address);
System.out.println(ob2.name);
System.out.println(ob2.phn);
System.out.println(ob2.age);
System.out.println(ob2.salr);
System.out.println(ob2.address);
}

}