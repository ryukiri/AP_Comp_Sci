public class FCConverter 
{
    public static double cToF(double degrees)
    {
        double fah = ((degrees*9)/5)+32;
        return fah;
    }
    
    public static double fToC(double degrees)
    {
        double cel = ((degrees - 32)*5)/9;
        return cel;
    }
}
