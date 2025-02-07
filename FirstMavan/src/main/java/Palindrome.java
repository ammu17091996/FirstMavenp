
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int number, reverse = 0;  
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		int check=number;
		while(number!=0)
		{
		int reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
				}
		if(check==reverse)
			System.out.println("Number is Palindrome");	
		else
			System.out.println("Number not palindrome");
		}  
		  }