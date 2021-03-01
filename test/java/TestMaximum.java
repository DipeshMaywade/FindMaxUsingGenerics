import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

    @Test
    public void givenIntMaximumAtFirstPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {10, 2, 1,5,4};
        Assert.assertEquals(arr[0], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenIntMaximumAtSecondPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {2,10,1,3,7};
        Assert.assertEquals(arr[1], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenIntMaximumAtThirdPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {2,1,10};
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenFloatMaximumAtFirstPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {10.0, 1.0, 2.0};
        Assert.assertEquals(arr[0], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenFloatMaximumAtSecondPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {2.0, 10.0, 1.0};
        Assert.assertEquals(arr[1], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenFloatMaximumAtThirdPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {2.0, 1.0, 10.0};
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenStringMaximumAtFirstPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {"Peach", "Banana", "Apple"};
        Assert.assertEquals(arr[0], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenStringMaximumAtSecondPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {"Apple", "Peach", "Banana"};
        Assert.assertEquals(arr[1], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenStringMaximumAtThirdPosition() {
        Maximum checkMax = new Maximum();
        Object[] arr = {"Banana", "Apple", "Peach"};
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void name() {
        Object[] arr = {"Banana", "Apple", "Peach"};
        Maximum checkMax=new Maximum(arr);
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum1());

    }
}