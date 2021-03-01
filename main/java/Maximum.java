import java.util.*;

public class Maximum<T>{
    private T[] inputArray;

    public Maximum(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Maximum() {}

    public <T> Comparable findGenericMaximum(T[] myNumber){
        List myNumberList = Arrays.asList(myNumber);
        Comparable max = Collections.max(myNumberList);
        return max;
    }
}