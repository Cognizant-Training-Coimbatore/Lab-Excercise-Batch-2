package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class pgmex05_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lists1=new ArrayList();
		lists1.add("abhi");
		lists1.add("Irfan");
		lists1.add("Stani");
		System.out.println(lists1);
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int i=0;
		int flag=0;
		for(Object obj:lists1)
		{
			if (obj.equals(str1))
			{
				System.out.println(i);
				flag=1;
				break;
			}
			i++;
		}
		if (flag==1)
		{
			System.out.println(i);
			//lists1.remove(i);
			System.out.println(lists1);
			lists1.set(i,str2);
		}
		System.out.println(lists1);
	}

}
