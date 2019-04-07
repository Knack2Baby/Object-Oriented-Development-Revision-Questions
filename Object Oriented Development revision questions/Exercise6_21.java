import java.util.*;
import java.io.*;
public class Exercise6_21
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop: ");
		int TotalBalls = in.nextInt();
		System.out.println("Enter the number of slots in the bean machine: ");
		int TotalSlots = in.nextInt();
		
		int[] slots = new int[TotalSlots +1];
		String direction;
		for (int i = 0; i < TotalBalls; i++) 
		{
            int sum = 0;
			for (int j = 0; j < TotalSlots; j++) 
			{
			    int number = (int) (Math.random() * 2);
				sum = sum + number;
				if (number == 0)
				{
					direction = "L";
				}
				else
				{
					direction = "R";
				}
				System.out.print(direction);
			}
			slots[sum]++;
			System.out.println();
		}
		String[] ball = new String[TotalSlots + 1];
        for (int i = TotalBalls; i > 0; i--) 
		{
            for (int j = 0; j <= TotalSlots; j++) 
			{
                if (i == slots[j]) 
				{
                    ball[j] = "O";
                    slots[j]--;
                } 
				else
				{
                    ball[j] = " ";
				}
                System.out.print(ball[j]);
            }
			System.out.println();
        }
	}
}