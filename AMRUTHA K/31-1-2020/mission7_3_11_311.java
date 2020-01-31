package javapack;

public class mission7_3_11_311 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for( i=0;i<=100;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
			else if(i%11==0) {
				System.out.println(i);
			}
			else if((i%3)==0 && (i%11)==0) {
				System.out.println(i);
			}
		}

	}

}
