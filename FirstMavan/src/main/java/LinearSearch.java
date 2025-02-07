import java.util.Scanner;

public class LinearSearch {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      int r=0,d=0;
      int size = array.length;
      System.out.println("enter the element to search");
      Scanner s=new Scanner(System.in);
      int value=s.nextInt();
      for (int i=0 ;i< size-1; i++){
         if(array[i]==value){
            r++;
         }else
            
         d++;
      }
      if(r>0)
      System.out.println("Element  found");
      else
    	  System.out.println("Element not found");	  
   }
}
