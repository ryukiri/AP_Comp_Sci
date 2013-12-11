package stars;

public class Stars
{
    public static void main(String[] args) 
    {
        int space = 0, k = 0, a = 0;
        for(k = 1; k <= 6; k ++)
        {
            for(space = 26; space > k; space--)
            {
            System.out.print(" ");
            }
            
            for(a = 1; a < k; a++)
            {
            System.out.print("*");
            }
            
            for(a = k; a >= 1; a--)
            {
            System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
