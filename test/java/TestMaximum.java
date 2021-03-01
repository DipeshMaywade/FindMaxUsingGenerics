import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    @Test
     public void maxNumberAtFirst() {
        Maximum maxValue = new Maximum();
        List <String> list = Arrays.asList("yellow", "blue", "white");
        Assertions.assertEquals("yellow", maxValue.findMax(list));
    }

    @Test
    void maxNumberAtSecond() {
        Maximum maxValue = new Maximum();
        List <Integer> list = Arrays.asList(11,45,3);
        Assertions.assertEquals(45, (Integer) maxValue.findMax(list));
    }

    @Test
    void maxNumberAtThird() {
        Maximum maxValue = new Maximum();
        List list = Arrays.asList(11.2, 43.2, 33.2);
        Assertions.assertEquals(43.2, maxValue.findMax(list));
    }
}
