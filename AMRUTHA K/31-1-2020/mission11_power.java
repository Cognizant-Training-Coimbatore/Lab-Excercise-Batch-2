package javapack;

import java.util.Scanner;
class prime{
	int power() {
		int n;
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	if(x==0) {
		return 0;
	}
	while(x!=1) {
		if(x%4!=0) {
		
		return 0;}
		x=x/4;
	}
	
		return 1;

}}
public class mission11_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime ob= new prime();
		int a=ob.power();
		//System.out.println(a);
	if(	a==0)
	{
		System.out.println("not a power");
	}
	else if(a==1)
		System.out.println("is a power of 4");
		
		
	}

}
