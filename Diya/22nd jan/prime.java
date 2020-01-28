import java.util.Scanner;
class prime
{    
 public static void main(String args[])
{    
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();
int i,flag=0, c;               
for(c=2;c<=n;c++)
	{  
  
   	for(i=2;i<=c/2;i++)
		{      
    		if(c%i==0)
			{           
     			flag++;      
     			break;      
    			}      
  		}      
   	if(flag==0) 
		{ 
		System.out.print(c+" "); 
		}  
flag=0;
}    
}
} 