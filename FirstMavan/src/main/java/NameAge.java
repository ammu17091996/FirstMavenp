import java.util.Scanner;
public class NameAge {
	static String sname;
	static int age;

	public static void main(String[] args) {
		
		NameAge.details();
		NameAge.print();
		
	}
public static void details()
{
	
	System.out.println("enter name and age ");
	Scanner s = new Scanner(System.in)) {
		sname=s.nextLine();
		age=s.nextInt();
	}
}
public static void print()
{
	
	System.out.println("name is "+sname);
	
	System.out.println("age is "+age);
}

}