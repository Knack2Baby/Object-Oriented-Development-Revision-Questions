import java.util.*;
import java.io.*;
public class Exercise7_1
{
	static Scanner in;
	public static void main(String [] args)
	{
		in = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 marix row by row");
		String row1 = in.nextLine();
		String row2 = in.nextLine();
		String row3 = in.nextLine();
		sumColumn()
	}
	public static double sumColumn(double[][] m, int columnIndex)
	{
	    m = new double[4][3];
		int a = 0;
		int sum = 0;
		for(int i = 0; i < m.length; i++)
		{
			for(int j = 0; j < m[i].length; j++)
			{
				a = a + 1;
				m[i][j] = a;
				System.out.println(m[i][j]+ "");
				sum += a;
			}
			System.out.print(">>>" + sum);
			sum = 0;
			System.out.println();
		}
		return sum;
	}
}