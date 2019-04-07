import java.util.*;
import java.io.*;
public class Exercise2_25
{
	static Scanner in;
	public static void main(String[] args)throws IOException
	{
		in = new Scanner(System.in);
		String Name;
		System.out.println("Enter employees name : ");
		Name = in.nextLine();
		in = new Scanner(System.in);
		int Hours;
		System.out.println("Enter number of hours worked in a week : ");
		Hours = in.nextInt();
		in = new Scanner(System.in);
		double HourlyPayRate;
		System.out.println("Enter hourly pay rate: ");
		HourlyPayRate = in.nextDouble();
		in = new Scanner(System.in);
		double FederalTaxWithholdingRate;
		System.out.println("Enter federal tax withholding rate: ");
		FederalTaxWithholdingRate = in.nextDouble();
		in = new Scanner(System.in);
		double StateTaxWithholdingRate;
		System.out.println("Enter state tax withholding rate: ");
		StateTaxWithholdingRate = in.nextDouble();
		double GrossPay = Hours*HourlyPayRate;
		double FederalWithholding = GrossPay*FederalTaxWithholdingRate;
		double StateWithholding = GrossPay*StateTaxWithholdingRate;
		double TotalDeduction = FederalWithholding + StateWithholding;
		double NetPay = GrossPay - TotalDeduction;
		System.out.println("Employee Name : " + Name +
		                   "\nHours Worked : " + Hours +
						   "\nPay Rate : " + HourlyPayRate +
						   "\nGross Pay : " + GrossPay +
						   "\nDeductions : " +
						   "\n  Federal Withholding " + "(" + FederalTaxWithholdingRate +"):  " + FederalWithholding +
						   "\n  State Withholding " + "(" + StateTaxWithholdingRate + "):  " + StateWithholding +
						   "\n  Total Deduction:  " + TotalDeduction +
						   "\nNet Pay: " + NetPay);
	}
}