import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		System.out.println("enter the limit of first array");
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		System.out.println("enter the limit of second array");
		int n=s.nextInt();
		int sum=0;
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		int c[][]=new int[m][n];
		int i,j;
		System.out.println("enter the elements of first array");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		
		System.out.println("enter the elements of second array");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				b[i][j]=s.nextInt();
		
	if(m==n)
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
	System.out.println("Sum is="+c[i][j]);
			}
	else
		System.out.println("Addition not possible");
	}


}