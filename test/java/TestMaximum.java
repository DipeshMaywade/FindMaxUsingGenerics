import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestMaximum {

    @Test
    void maxNumberAtFirst() {
        Maximum maxValue = new Maximum();
        List<String> list = Arrays.asList("yellow", "blue", "white");
        Assertions.assertEquals("yellow", maxValue.findMax(list));
    }

    @Test
    void maxNumberAtSecond() {
        Maximum maxValue = new Maximum();
        List<String> list = Arrays.asList("blue", "yellow", "white");
        Assertions.assertEquals("yellow", maxValue.findMax(list));
    }

    @Test
    void maxNumberAtThird() {
        Maximum maxValue = new Maximum();
        List<String> list = Arrays.asList("blue", "red", "yellow");
        Assertions.assertEquals("yellow", maxValue.findMax(list));
    }
}
