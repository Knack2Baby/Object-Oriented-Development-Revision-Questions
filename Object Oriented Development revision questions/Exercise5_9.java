public class Exercise5_9
{
	public static void main(String [] args)
	{
		footToMeter(1.0);
		meterToFoot(20.0);
		System.out.println("Feet \t Meters \t | \t Meters \t Feet");
		System.out.println(foot +" \t " + meters + " \t | \t " + meter + " \t " + feet);
	}
	/** Convert from feet to metres */
	public static double footToMeter(double foot)
	{
		double meters = 0.305*foot;
		return meters;
	}
	/** Convert from meters to feet */
	public static double meterToFoot(double meter)
	{
		double feet = 3.279*meter;
		return feet;
	}
}