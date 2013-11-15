package funwithcalendars;

public class FunWithCalendarsTest 
{
    public static void main(String args[]){
        FunWithCalendars Cal = new FunWithCalendars(1,31,2008);
        Cal.isLeapYear();
        //Cal.isValidDay();
        //Cal.isValidMonth();
        Cal.isValid();
        Cal.numDay();
        System.out.println(Cal.isLeapYear());
        //System.out.println(Cal.isValidDay());
        //System.out.println(Cal.isValidMonth());
        System.out.println(Cal.isValid());
        System.out.println(Cal.getDayOfWeek());
        System.out.println(Cal.daytoMonth());

    }
}
