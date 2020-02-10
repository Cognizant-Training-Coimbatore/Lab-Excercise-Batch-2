package Exercise;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class Q17_31_01_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the Number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),i,j;
		for(i=1;i<=n;i++)
		{
			System.out.print(StringUtils.repeat(" ",(n-i)));
			for(j=i;j>=1;j--) {
				System.out.print((char)(j+64));
			}
			for(j=2;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.print("\n");
		}
		i=0;j=0;
		for(i=n-1;i>=1;i--)
		{
			System.out.print(StringUtils.repeat(" ",(n-i)));
			for(j=i;j>=1;j--) {
				System.out.print((char)(j+64));
			}
			for(j=2;j<=i;j++) {
				System.out.print((char)(j+64));
			}
			System.out.print("\n");
		}
	}

}
