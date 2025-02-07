

	import java.util.Scanner;
	class Array
	{
	public static void main(String args[])
	{
	System.out.println("enter the limit");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	int a[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
	 a[i]=s.nextInt();

	sum=sum+a[i];
	}

	System.out.println("Sum of array numbers is"+sum);
	}
	}
	


