package fraction;

public class FractionTest 
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(5);
        Fraction f3 = new Fraction(6,8);
        Fraction f4 = new Fraction(f3);
        
        System.out.println(f1.getNum());
        System.out.println(f2.getNum());
        System.out.println(f3.getNum());
        System.out.println(f4.getNum());
    }
}
