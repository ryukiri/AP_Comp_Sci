public class FunWithBinarySearch {

    public int find(int[] arr, int value) {
        // Perform a binary search on the array arr, looking for value.
        // This method should return the index of the arr the value is found.
        // Returns -1 if the value is not in the arr
        return binarySearch(arr, value, 0, arr.length-1);
    }
    
    public int binarySearch (int [ ] arr, int value, int left, int right)
    {
        if (right < left)
            return -1;       // Not found

        int middle = (left + right) / 2;
        if (value == arr [middle] )
            return middle;
        else if (value < arr[middle])
            return binarySearch (arr, value, left, middle - 1);
         else     //  if ( value > arr[middle])
            return binarySearch (arr, value, middle + 1, right);
    }
}