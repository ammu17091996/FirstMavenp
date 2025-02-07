
import java.util.Scanner;
class Student
{

public Student()
{

System.out.println("enter the student name");
Scanner s=new Scanner(System.in);
String name=s.nextLine();
System.out.println("enter the age");
int age=s.nextInt();
}
public Student(String name,int age)
{
System.out.print("student name is"+name);

System.out.print("Age is"+age);

}

public static void main(String args[])
{
Student s=new Student();

System.out.println("enter the student name");
Scanner st=new Scanner(System.in);
String name=st.nextLine();
System.out.println("enter the age");
int a=st.nextInt();
Student d=new Student(name,a);
}

}
