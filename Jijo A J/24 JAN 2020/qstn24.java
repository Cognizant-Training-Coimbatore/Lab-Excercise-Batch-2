class member
{
String name,phone ,address;
double salary;
int age;

void printsalary()
{
	System.out.print(name+"    "+salary);
	}
}
class manager extends member
{
String department ;
manager(String name1,int age1 ,String phone1,String address1,double salary1,String department1)
{
	name=name1;
	salary=salary1;
	age=age1;
	phone=phone1;
	address=address1;
	department=department1;
	printsalary();
	{
		System.out.println("    "+department+"    "+age+"    "+phone+"    "+address);
		}
			
}
}
class employee extends member
{
String specialization;
employee(String name2,int age2 ,String phone2,String address2,double salary2,String specialization2)
{
	name=name2;
	salary=salary2;
	age=age2;
	phone=phone2;
	address=address2;
	specialization=specialization2;
	printsalary();
	{
		System.out.println("    "+specialization+"    "+age+"    "+phone+"    "+address);
		}
}
}
public class qstn24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
manager xx=new manager("sarath",34,"9895639874","eloor",30000,"BPO");
employee xx1=new employee("jomon",24,"9899999999","eloor",50000,"testing");

	}

}
