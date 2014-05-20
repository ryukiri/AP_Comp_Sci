package digitextractor;

public class DigitPrinter
{
	public static void main( String [] args )
	{
		DigitExtractor test = new DigitExtractor(16384);
		System.out.println(test.nextDigit());
		System.out.println(test.nextDigit());
		System.out.println(test.nextDigit());
		System.out.println(test.nextDigit());
		System.out.println(test.nextDigit());
	}
}