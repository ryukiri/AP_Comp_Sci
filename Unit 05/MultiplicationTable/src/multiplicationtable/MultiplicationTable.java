package multiplicationtable;

public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        for(int r=1; r<11;r++)
        {
            for(int c=1; c<11;c++)
            {
                System.out.print(c*r+"   ");
            }
            System.out.println();
        }
    }
}
