import java.util.Scanner;

public class q5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]=new String[5];
		name[0]="john";
		name[1]="sam";
		name[2]="josh";
		name[3]="job";
		name[4]="jim";
		for(int i=0;i<5;i++)
		{
			name[i]=name[i].toUpperCase();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]);
		}
	}

}
