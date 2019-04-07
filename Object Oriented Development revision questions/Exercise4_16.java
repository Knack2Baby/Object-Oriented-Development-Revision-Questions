import java.util.*;

public class Exercise4_16 {
   public static void main(String args[]){
      int number;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number ::");
      number = in.nextInt();
      
      for(int i = 2; i< number; i++) 
	  {
        while(number%i == 0) 
		{
			System.out.println(i+ " ");
			number = number/i;
        }
      }
      if(number >2) 
	  {
        System.out.println(number);
      }
   }
}