import java.util.Scanner;
public class prg_53_Q3 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int[] arr=new int[20];
  int i,j;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the numbers");
  for(i=0;i<10;i++)
  {
   arr[i]=sc.nextInt();
   
  }
  int max=arr[0],min=arr[0],sum=0,avg;
  for(i=1;i<10;i++)
  { 
   sum=sum+arr[i];
   if(max<arr[i])
   {
    max=arr[i];
   }
   else if(min>arr[i])
   {
    min=arr[i];
   }
   //else
   //{
    //min=arr[i+1];
    //max=arr[i];
   //}
  }
  //for(i=0;i<10;i++)
  //{
   //if(arr[i]<arr[i+1])
   //{
    //min=arr[i];
   //}
   //else
    //min=arr[i];
  //}
  avg=sum/10;
  System.out.println("maximum is"+max);
  System.out.println("minimum is"+min);
  System.out.println("average is"+avg);
  
 }
}
