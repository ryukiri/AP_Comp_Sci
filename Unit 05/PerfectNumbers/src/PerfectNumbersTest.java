public class PerfectNumbersTest 
{
    public static void main(String args[])
    {
        PerfectNumbers number = new PerfectNumbers();
        
        //System.out.println("Perfect Numbers: ");
        System.out.println(number.perfectNumber(1));
        System.out.println(number.perfectNumber(2));
        System.out.println(number.perfectNumber(3));
        System.out.println(number.perfectNumber(4));
        System.out.println(number.perfectNumber(5));
        
        System.out.println("Primes: ");
        System.out.println(number.mersennePrime(1));
        System.out.println(number.mersennePrime(2));
        System.out.println(number.mersennePrime(3));
        System.out.println(number.mersennePrime(4));
        System.out.println(number.mersennePrime(5));
        System.out.println(number.mersennePrime(6));
    }
}
