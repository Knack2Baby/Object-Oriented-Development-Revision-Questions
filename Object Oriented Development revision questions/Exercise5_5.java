public class Exercise5_5
{
	public static void main(String [] args)
{
	displayLargestNumber(1,2,3);
}

    public static void displayLargestNumber(double num1, double num2, double num3)
	{
		double result = Math.max((Math.max(num1,num2)),num3);
		System.out.print(result);
	}
}