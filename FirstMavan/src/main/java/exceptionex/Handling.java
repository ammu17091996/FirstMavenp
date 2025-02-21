package exceptionex;

public class Handling {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b=10;
		System.out.println("Start");
		try
		{
	
		try {
			int c= b/0;
			
		}catch(ArithmeticException e)
		{
			
System.out.println(e);
}
a[10]=10;
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			
		System.out.println(ae);
		}catch(ArithmeticException e)
                                 {
			
			System.out.println(e);}
	}

}
