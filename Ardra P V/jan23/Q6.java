import java.util.Scanner;

class student2{
	String x[]=new String[20];
	void name() {
		String a[]=new String[20];
		int result=0;
		java.util.Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of students: ");
		 int c=scanner.nextInt();
		System.out.println("Enter students: ");
		int i;
		for(i=0;i<c;i++) {
        
        a[i]=scanner.nextLine();}
		x[i]=a[i];
	if(x[i].length()== 0) {
		System.out.println("Undefined");
	}
	else {
		System.out.println(c);
	}
}
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		student2 st=new student2();
		st.name();
	}

}
