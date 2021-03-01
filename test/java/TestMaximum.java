import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    @Test
    void maxNumberAtFirst() {
        Maximum maxValue = new Maximum();
        List<Double> list = Arrays.asList(99.9,11.1,53.3);
        Assertions.assertEquals(99.9, maxValue.findMax(list));
    }

    @Test
    void maxNumberAtSecond() {
        Maximum maxValue = new Maximum();
        List<Double> list = Arrays.asList(1.1,11.3,5.4);
        Assertions.assertEquals(11.3, maxValue.findMax(list));
    }

    @Test
    void maxNumberAtThird() {
        Maximum maxValue = new Maximum();
        List<Double> list = Arrays.asList(6.3,1.4,12.2);
        Assertions.assertEquals(12.2, maxValue.findMax(list));
    }
}
