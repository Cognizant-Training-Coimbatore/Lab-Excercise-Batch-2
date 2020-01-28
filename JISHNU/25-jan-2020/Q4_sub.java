package day4a;
import day4.Q4_super;
public class Q4_sub extends Q4_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get();
		for(int j=0;j<5;j++)
		{
			System.out.println("Details of employee"+(j+1));
			System.out.println(name[j]);
			System.out.println(address[j]);
			System.out.println(department[j]);
			System.out.println(salary[j]);
		}

	}

}
