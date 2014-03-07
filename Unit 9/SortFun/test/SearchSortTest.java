import org.junit.Assert;
import org.junit.Test;

public class SearchSortTest {
    @Test
    public void test1() throws Exception{
        FunWithSelectionSort test = new FunWithSelectionSort(new int[]{5, 4, 6, 3, 7, 2, 8, 1, 9});
        test.sort();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, test.getList());
    }

    @Test
    public void test2() throws Exception{
        FunWithInsertionSort test = new FunWithInsertionSort(new int[]{5, 4, 6, 3, 7, 2, 8, 1, 9});
        test.sort();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, test.getList());

    }

    @Test
    public void test3() throws Exception{
        FunWithBinarySearch test = new FunWithBinarySearch();
        Assert.assertEquals(3, test.find(new int[]{1, 2, 3, 4, 5}, 4));
        Assert.assertEquals(-1, test.find(new int[]{1, 2, 3, 4, 5}, 6));
    }

}