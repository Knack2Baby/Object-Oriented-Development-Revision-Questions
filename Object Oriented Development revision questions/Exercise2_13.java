import java.io.*;
import java.util.*;
public class Exercise2_13
{
	static Scanner in;
	public static void main(String [] args)
	{
		double InterestRate = 0.05;
		double MonthlyIR = 0.05/12;
		int UserInput;
		in = new Scanner(System.in);
		System.out.println("Enter the monthly savings amount:");
		UserInput = in.nextInt();
		double month1 = UserInput*(1 + MonthlyIR);
		double month2 = (UserInput + month1)*(1 + MonthlyIR);
		double month3 = (UserInput + month2)*(1 + MonthlyIR);
		double month4 = (UserInput + month3)*(1 + MonthlyIR);
		double month5 = (UserInput + month4)*(1 + MonthlyIR);
		double month6 = (UserInput + month5)*(1 + MonthlyIR);
		System.out.println("After the sixth month the account value is " + month6);
	}
}