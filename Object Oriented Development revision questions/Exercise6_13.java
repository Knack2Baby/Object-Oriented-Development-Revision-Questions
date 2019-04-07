import java.io.*;
import java.util.*;
public class Exercise6_13
{
	public static void main(String [] args)
	{
		int[] numbers = new int[54];
		getRandom(1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53);
	}
	public static int getRandom(int... numbers)
	{
		number = 0;
		number = (int)(Math.random()*54+1);
		for(int i = 0; i<numbers.length;	i++)
		{
			if(number = numbers[i])
			{
				number = (int)(Math.random()*54+1);
				i=0;
			}
		}
		return number;
	}
}