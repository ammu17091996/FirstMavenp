import java.util.Scanner;

public class Factorial {

	static int fact=1;
	static int n;
	public static void main(String[] args) 
	{
	Factorial.numberfact();
	Factorial.calculate();
		
	}
	public static void numberfact()
	{
		
		System.out.println("enter a number");
		s = new Scanner(System.in);
	n=s.nextInt();
	for(int i=1;i<=n;i++)
		fact=fact*i;
	}
	public static void calculate()
	{
		
		System.out.println("Factorial of "+n+"is"+fact);
	}

	}
		



