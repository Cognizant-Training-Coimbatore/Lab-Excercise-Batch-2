
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag1=0,flag2=0, flag3=0, i;
		System.out.println("numbers divisible by both 3 and 11");
		for( i = 0; i <= 100; i++) {
			if(i%3 == 0 && i % 11 == 0) {	
				System.out.println(i);
			}		
		}	
		
		System.out.println("numbers divisible only by 3 :");
		for(i = 0; i <=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("numbers divisible only by 11 :");
		for(i = 0; i <=100; i++) {
			if(i%11==0) {
				System.out.println(i);
			}
		}
}
}