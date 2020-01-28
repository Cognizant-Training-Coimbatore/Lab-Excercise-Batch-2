package j25_q4_pack2_print;
import j25_q4_pack1_store.storeEmployeeDetails;
public class printEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   storeEmployeeDetails ob = new storeEmployeeDetails();
   System.out.println("The details of the 5 employees are: ");
   for(int i=0;i<5;i++)
   {
	   System.out.println("name : "+ ob.name[i]);
	   System.out.println("address : "+ ob.address[i]);
	   System.out.println("department : "+ ob.department[i]);
	   System.out.println("salary : "+ ob.salary[i]);
	   System.out.println(" ");
   }
	}

}
