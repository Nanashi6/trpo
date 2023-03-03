import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testTernarySearch1() {
        int[] arr = {1,2,3,4,5,6,7,9,12,465,876};
        int target = 9;
        int trueIndex = 7;
        Assert.assertEquals(trueIndex, TernarySearch.ternarySearch(arr, target));
    }

    @org.junit.Test
    public void testTernarySearch2() {
        int[] arr = {1,2,3,4,5,6,7,9,12,465,876};
        int target = 8;
        int trueIndex = -1;
        Assert.assertEquals(trueIndex, TernarySearch.ternarySearch(arr, target));
    }
}
