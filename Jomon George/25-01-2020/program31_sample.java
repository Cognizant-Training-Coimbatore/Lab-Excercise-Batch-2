package demo;

import java.util.Scanner;

class storeArrayAndCaps
{
	Scanner scanner = new Scanner(System.in);
	
	void arrInput()
	{
	System.out.print("Enter No of elements: ");
	int count = scanner.nextInt();
	String[] arr=new String[count];
	System.out.print("Enter the elements: ");
	for(int i=0;i<count;i++)
	{
		 arr[i]=scanner.next();
	}
	for(int i=0;i<count;i++)
	{
		System.out.println(arr[i].toUpperCase());
	}
	}
}

class sumAvg1{
int[] input() {
	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter No of elements: ");
		int count = scanner.nextInt();
		int[] arr=new int[count];
		System.out.print("Enter the elements: ");
		for(int i=0;i<count;i++)
		{
			 arr[i]=scanner.nextInt();
		}
		return arr;
	}
	void sumAverage() {
		int arr[]=input();
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			 sum+=arr[i];
		}
		avg=sum/(arr.length);
		System.out.println("Sum : " + sum + "\nAverage : " + avg);
}
}

class copyArray{
	int a[] = {1, 8, 3};   
    int b[] = a.clone(); 

    copyArray()
    {
    System.out.println("Contents of a[] "); 
    for (int i=0; i<a.length; i++) 
        System.out.print(a[i] + " "); 

    System.out.println("\n\nContents of b[] "); 
    for (int i=0; i<b.length; i++) 
        System.out.print(b[i] + " "); 
    }
}

class ascendDescend{
	
	int[] input() {
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter No of elements: ");
			int count = scanner.nextInt();
			int[] arr=new int[count];
			System.out.print("Enter the elements: ");
			for(int i=0;i<count;i++)
			{
				 arr[i]=scanner.nextInt();
			}
			return arr;
		}
	ascendDescend() {
			int arr[]=input();
			int temp;
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = i + 1; j < arr.length; j++) { 
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.print("Ascending Order : "); 
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(" " + arr[i]);
			}
			System.out.print("\nDescending Order : "); 
			for(int i=arr.length-1;i>=0;i--)
			{
				System.out.print(" " + arr[i]);
			}
}
}

class sequentialSearch{
	int arr[]= {10,6,4,11,9,20,21,25,27,40};
	boolean flag=false;
	sequentialSearch(int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
				{System.out.println("Array element found at position " + i);flag=true;}
		}
		if(!flag)
		{
			System.out.println("Not Found");
		}
	}
	
}


public class program31_sample {
	
	String name,address,department;
	double salary;
//	public static int demo;
	
	protected void assign (String n,String addr,String dept, double sal)
	{
		name = n;
		address =addr;
		department = dept;
		salary =sal;
	}
	protected void show()
	{
		System.out.println("Name : " + name + " Address : " + address + " department : " + department + " Salary : " + salary);
	}
	
	public static void main(String[] args) {
		
//		storeArrayAndCaps Q5 = new storeArrayAndCaps();
//		Q5.arrInput();
//		
//		sumAvg1 Q6 = new sumAvg1();
//		Q6.sumAverage();
//		
//		copyArray Q7 = new copyArray();
		
//		ascendDescend Q8 = new ascendDescend();
		
		sequentialSearch Q9 = new sequentialSearch(25);
		
	}

}
