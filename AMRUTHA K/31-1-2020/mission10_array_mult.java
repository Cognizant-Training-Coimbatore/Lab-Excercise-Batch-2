package javapack;

public class mission10_array_mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int a[]= new int[5];
		int a[]= {2,3,4,5,6};
		int mult[]=new int[5];
		
		int b[]= {3,4,5,6,7};
		for(int i=0;i<5;i++) {
			
			 mult[i]=a[i]*b[i];
			
		}
		for(int i=0;i<5;i++) {
		System.out.println(mult[i]);
		}
	}

}
