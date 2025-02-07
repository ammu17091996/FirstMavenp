import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		int number, reverse = 0;  
		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		while(number!=0)
		{
		int reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
				}
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
		  }

