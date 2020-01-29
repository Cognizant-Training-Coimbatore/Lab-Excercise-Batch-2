package collection;

import java.util.HashMap;
import java.util.Scanner;

public class hashmapnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
hashmap.put(1, "java");
hashmap.put(2, "c++");
hashmap.put(3, "perl");
hashmap.put(4, "cobol");
hashmap.put(5, "fortran");
int opt;
Scanner scanner=new Scanner(System.in);
System.out.println("enter value between  1 to 5");
opt=scanner.nextInt();
String coursename=hashmap.get(opt);
System.out.println(coursename);
hashmap.remove(4);

	}

}
