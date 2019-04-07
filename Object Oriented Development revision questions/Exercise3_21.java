import java.util.Scanner;
public class Exercise3_21
{
	static Scanner in;
	public static void main(String [] args)
	{
		in = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012):");
		int year = in.nextInt();
		System.out.println("Enter month: 1-12:");
		int month = in.nextInt();
		if(month == 1 || month == 2)
		{
			month = month + 12;
			year--;
		}
		System.out.println("Enter the day of the month: 1-31:");
		int day = in.nextInt();
		int q = day;
		int m = month;
		int j = (int)(year/100);
		int k = year%100;
		int h = ((q) + ((26*(m+1))/10) + k + k/4 + j/4 + 5*j);		
		if(h == 0)
		{
			System.out.println("Day of the week is Saturday");
		}
		else if(h == 1)
		{
			System.out.println("Day of the week is Sunday");
		}
		else if(h == 2)
		{
			System.out.println("Day of the week is Monday");
		}
		else if(h == 3)
		{
			System.out.println("Day of the week is Tuesday");
		}
		else if(h == 4)
		{
			System.out.println("Day of the week is Wednesday");
		}
		else if(h == 5)
		{
			System.out.println("Day of the week is Thursday");
		}
		else if(h == 6)
		{
			System.out.println("Day of the week is Friday");
		}
	}
}	