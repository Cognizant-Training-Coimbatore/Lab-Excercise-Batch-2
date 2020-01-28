package demo11;

import java.util.Scanner;

class abc{
	int x,y;
	void dispaly() {
		System.out.println("enter no");
	Scanner a=new Scanner(System.in);
	int b=a.nextInt();
for(int j=0;j<b;j++) {
	for(int i=0;i<10;i++) {
		int mult=i*j;
		System.out.println(j+"*"+i+"="+mult);
	}}
	}
}
public class class2_mult_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj=new abc();
		obj.dispaly();

	}

}
