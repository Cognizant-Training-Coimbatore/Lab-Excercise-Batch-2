package project1;

public class prgd31_q10_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {1,2,3,4};
  int b[]= {5,6,7,8};
  int result[]=new int[4];
  for(int i=0;i<a.length;i++)
  {
	  result[i]=a[i]*b[i];
	  System.out.print(result[i]+",");
  }
  
	}

}
