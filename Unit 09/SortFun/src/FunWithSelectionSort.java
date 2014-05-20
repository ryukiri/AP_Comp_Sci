public class FunWithSelectionSort {

    private int[] list;
    private int l;

    public FunWithSelectionSort(int[] arr) {
        list = arr;
        l = list.length;
    }

    public int[] getList() {
        return list;
    }

    public void swap(int a, int b) {
    //It will take in two indices and swap those elements. For example, if list is: 
    // 5 4 6 3 7 2 8 1 9 
    //The statement swap(1, 3) will turn the list into this: 
    //5 3 6 4 7 2 8 1 9 (The data at index 1 and the data at index 3 have switched
        
        /*
        int indexOfA=0;
        for(int i = 0; i<list.length; i++){
            if(a==list[i]){
                indexOfA = i;
            }
        }

        int indexOfB=0;
        for(int i=0; i<list.length; i++){
            if(b==list[i]){
                indexOfB=i;
            }
        }
        */
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
        
        /*
        for(int i=0; i<list.length; i++){
            System.out.print(list[i]);
        }
        
        for(int z : list){
            System.out.print(z);
        }
        System.out.println();
        */
    }

    public int findIndexOfSmallest(int a) {
    //It will return the index of the smallest element, starting with element a. 
    //For example if list is: 
    //1 2 6 5 7 8 3 4 
    //The statement findIndexOfSmallest(2) will return 6. 
    //(6 is the index of the number 3, which is the smallest 
    //element if you start looking from element 2.)
        
        int mI = a;
        for (int i = a; i < l; i++) {
            if (list[mI] > list[i]) {
                mI = i;
            }
        }
        return mI;
    }

    public void sort() {
    // Using a for loop, find the smallest element in the list starting with element 0, 
    // and swap it with element 0. Then find the smallest element in the list starting 
    // with element 1, and swap it with element 1. 
    // Repeat until you reach the end of the list. 
        
        /*
        for(int i = 0; i<list.length; i++){
            int x = findIndexOfSmallest(i);
            System.out.print(x);
            //System.out.print(list[x]);
            //swap(list[i], list[x]);
        }
        */
        
        for (int i = 0; i < l - 1; i++) {
            swap(i, findIndexOfSmallest(i));
        }
    }
}