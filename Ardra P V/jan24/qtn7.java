import java.util.Scanner;

class WXYZ{
	static String name;
	
	WXYZ(){
		name="unknown";
		
	}
	  public static String getName(){
	    return name;
 }
	  public static void setName(String name1) {
		  name=name1;
	  }
	  }
public class qtn7 {

	public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String a= sc.nextLine();
		WXYZ.setName(a);
		System.out.println(WXYZ.getName());
		sc.close();
	}

}
