import java.io.*;
import java.util.*;
public class Exercise3_17
{
	static Scanner in;
	public static void main(String [] args)
	{
		int Computer = (int)(Math.random()*3);
		in = new Scanner(System.in);
		int choice;
		System.out.println("scissor(0) rock(1) paper(2)");
		choice = in.nextInt();
		if(choice == 0 || choice == 1 || choice == 2)
		{
			if(Computer == 0 && choice == 0)
	        {
			    System.out.println("computer is scissor, you are scissor too, it's a draw");
		    }
		    else if(Computer == 0 && choice == 1)
    	 	{ 
	    		System.out.println("computer is scissor, you are rock, you win");
		    }
		    else if(Computer == 0 && choice == 2)
		    {
			    System.out.println("computer is scissor, you are paper, you lose");
    		}
	    	else if(Computer == 1 && choice == 0)
		    {
			    System.out.println("computer is rock, you are scissor, you lose");
		    }
		    else if(Computer == 1 && choice == 1)
		    {
			    System.out.println("computer is rock, you are rock too, it's a draw");
		    }
    		else if(Computer == 1 && choice == 2)
	    	{
		    	System.out.println("computer is rock, you are paper, you win");
		    }
		    else if(Computer == 2 && choice == 0)
    		{
	    		System.out.println("computer is paper, you are scissor, you win");
		    }
		    else if(Computer == 2 && choice == 1)
		    {
			    System.out.println("computer is paper, you are rock, you lose");
	 	    }
		    else
		    {
			    System.out.println("computer is paper, you are paper too, it's a draw");
		    }
		}
		else
		{
			System.out.println("sorry that is not a valid input");
		}
		
	}
}