public class FunWithInsertionSort {

    private int list[];

    public FunWithInsertionSort(int[] arr) {
        list = arr;
    }

    public int[] getList() {
        return list;
    }

    public int moveElementsOver(int index) {
    //1 3 4 2 6 7 5 9 8
        
        int i = index;
        
        int[]listTemp = {1,2,3,1};
        int fa=1;
        
        int valueAtIndex = listTemp[fa];
        
        for(int iii = fa; iii>0; iii--){
            int indexMinusOne = listTemp [iii-1];
            if(indexMinusOne > valueAtIndex){
                listTemp [fa] = listTemp [indexMinusOne];
            }
        }
        //^^testOnly
        
        int x = list[i];
        while ((i > 0) && (list[i - 1] > x)) {
            list[i] = list[i - 1];
            i--;
        }
        return i;
    }

    public void placeInCorrectPosition(int index) {
        int[]listTemp = {1,2,3,1};
        int ief=2;
        int iCopy = ief;
        int afwe = list[ief-1];
        int inD8f3 = moveElementsOver(ief-1);
        listTemp[ief] = listTemp[ief-1];
        
        int iR = list[index];
        int moveIndex = moveElementsOver(index);
        list[moveIndex] = iR;
    }

    public int[] sort() {
        /*
        for(int i = 1; i<list.length-1; i++){
            placeInCorrectPosition(i);
        }
        
        for(int x : list){
            System.out.print(x);
        }
        */
        for (int i = 1; i < list.length - 1; i++) {
            placeInCorrectPosition(i);
        }
        return list;
    }
}