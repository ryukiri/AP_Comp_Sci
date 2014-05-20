package eastersunday;

public class EasterSundayTest {
    public static void main(String args[]){
    EasterSunday test = new EasterSunday( 2001 );
    int x = test.getEasterSundayMonth();
    System.out.println(x);
    int y = test.getEasterSundayDay();
    System.out.println(y);
    }
}
