import java.util.*;

public class MagicSquareTest {
    public static void main(String args[]){
        MagicSquare box = new MagicSquare();
        
        int x[][]={ 
                    {16, 3, 2, 13}, 
                    {5, 10, 11, 8}, 
                    {9, 6, 7, 12}, 
                    {4, 15, 14, 1}
                    };
        
        box.isMagicSquare(x[][]);
    }
}
