/*Austin Quach, P3
 *Write a class to computer the date of Easter Sunday. 
 * Easter Sunday is the first Sunday after the first full mooon of spring. 
 * Create a class EasterSunday that takes in an integer value for the year. 
 * The user should use methods getEasterSundayMonth() and getEasterSundayDay()
 * to receive information about the date of Easter for that calendar year. 
 * Use this algorithm, invented by mathematician Carl Friedrich Gauss in 1800:
 * 1. Let y be the year
 * 2.Divide y by 19 and call the remainder a. Ignore the quotient
 * 3. Divide y by 100 to get a quotient b and a remainder c. 
 * 4. Divide b by 4 to get a quotient d and a remainder e. 
 * 5. Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
 * 6. Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient. 
 * 7. Divide c by 4 to get a quotient j and a remainder k. 
 * 8. Divide a + 11 * h by 310 to get a quotient m. Ignore the remainder. 
 * 9. Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient. 
 * 10. Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder. 
 * 11. Divide h - m + r + n + 19 by 32 to get a remainder p. Ignore the quotient. 
 * Easter falls on the day p of month n. For example, if the year is 2001, Easter Sunday is on April 15
 */
package eastersunday;

public class EasterSunday 
{
    int a;
    int b;
    int c;
    int d;
    int e;
    int g;
    int h;
    int j;
    int k;
    int m;
    int r; 
    int n;
    int p;
    public EasterSunday(int y)
    {
        a = y % 19;
        b = y / 100;
        c = y % 100;
        d = b / 4;
        e = b % 4;
        g = (8*b+13) / 25;
        h = (19 * a + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = (a + 11 * h) / 310;
        r = (2 * e + 2 * j - k - h + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        p = (h - m + r + n + 19) % 32;
    }
    public int getEasterSundayMonth()
    {
        return n;
    }
    public int getEasterSundayDay()
    {
        return p;
    }
}
