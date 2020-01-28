import java.util.Scanner;

class program{
	int l,i;
	void bla() {
	
	System.out.println("number");
	Scanner scanner=new Scanner(System.in);
	l=scanner.nextInt();}
	void multi() {
		
		for(i=1;i<=l;i++) {
			int x=i*l;
			System.out.println(x);
		}
	}
}
	
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program obj=new program();
		obj.bla();
		obj.multi();

	}

}
