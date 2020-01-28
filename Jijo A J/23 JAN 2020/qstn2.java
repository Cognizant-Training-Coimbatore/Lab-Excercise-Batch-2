class student1
{
	String name;
	int Roll_no;
	String phone;
	String Address;

		student1(String name1,int Roll_no1,String phone1, String Address1)
		{		
			name=name1;
			Roll_no=Roll_no1;
			phone=phone1;
			Address=Address1;
		System.out.println("name : "+name);
		System.out.println("Roll NO : "+Roll_no);
		System.out.println("Phone number : "+phone);
		System.out.println("Address "+Address+"\n");
		}
}

public class qstn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 xx=new student1("john",2,"9895639874","Perumbavoor");
		student1 xxx=new student1("sam",3,"9895639875","Paravoor");
		
	}

}
