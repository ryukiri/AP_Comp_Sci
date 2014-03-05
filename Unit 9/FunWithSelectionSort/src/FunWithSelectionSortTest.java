import java.io.*;

public class FunWithSelectionSortTest {
    public static void main(String args[]){
        //int[] y={5, 4, 6, 3, 7, 2, 8, 1, 9};
        int[] y={1, 2, 6, 5, 7, 8, 3, 4 };
        FunWithSelectionSort x = new FunWithSelectionSort(y);
        
        //x.swap(1, 3);
        System.out.println(x.findIndexOfSmallest(2));
        //x.getList();
    }
}
