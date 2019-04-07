import java.util.*;
import java.io.*;
public class Exercise4_25
{
	public static void main(String [] args)
	{
		System.out.println("Enter Integer:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		for(int i = 1; i<n; i++)
		{
			for(int j=1; j<i; j++)
			{
				result += j;
			}
		}
		System.out.println(result);
	}
}