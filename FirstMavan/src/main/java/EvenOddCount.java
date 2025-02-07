import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
	    
	      int sum=0;
	      int s=0,r=0;
	      for(int i=10;i<=20;i++)
	      {
	    	  
	    	  if(i%2==0)
	    		  s++;
	    	  else
	    		  r++;
	      }
	      System.out.println("number of even numbers are"+s);
	      System.out.print("number of odd numbers are"+r);
	}
}  
