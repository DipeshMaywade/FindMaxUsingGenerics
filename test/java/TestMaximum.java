import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    @Test
    void maxNumberAtFirst() {
        Maximum maxValue = new Maximum();
        List<Integer> list = Arrays.asList(11,1,5);
        Assertions.assertEquals(11, maxValue.findMax(list));
    }

    @Test
    void maxNumberAtSecond() {
        Maximum maxValue = new Maximum();
        List<Integer> list = Arrays.asList(1,11,5);
        Assertions.assertEquals(11, maxValue.findMax(list));
    }

    @Test
    void maxNumberAtThird() {
        Maximum maxValue = new Maximum();
        List<Integer> list = Arrays.asList(5,1,11);
        Assertions.assertEquals(11, maxValue.findMax(list));
    }
}
